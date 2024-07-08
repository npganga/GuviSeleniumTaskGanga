package task21SeleniumWindowsAndFrames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHerokuapp {

	public static void main(String[] args) {
		
		//Initialization
		WebDriver driver = new ChromeDriver();
				
		//Launch URL
		driver.get("https://the-internet.herokuapp.com/windows");
				
		//Maximize the screen
		driver.manage().window().maximize();
				
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String BaseWindow= driver.getWindowHandle();
		System.out.println("Before clicks Link : " +BaseWindow);
				
		//Click 'Click Here' link
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		//Switch to new window
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Convert Set to List
		List<String> windows = new ArrayList<String>(windowHandles);
		
		//Pick the New window and switch to it.
		driver.switchTo().window(windows.get(1));
		
		//Verify the content of the new Window
		String ContentText =driver.findElement(By.xpath("//body")).getText();
		
		if(ContentText.equalsIgnoreCase("New Window")) {
			System.out.println(ContentText+" is available in the New Window Page");
		}
		else {
			System.out.println(ContentText+" is not available in the New Window Page");	
		}
		
		//Close the newly opened window 'New Window'
		driver.close();
		
		//Switch back to Base window
		driver.switchTo().window(windows.get(0));
		
		//Verify the Base Window is active
		if(BaseWindow.equals(driver.getWindowHandle())) {
			System.out.println("Original Window is active");
		}
		else {
			System.out.println("Original Window is not active");
		}
		
		//Close the browser instance
		driver.quit();
	}

}
