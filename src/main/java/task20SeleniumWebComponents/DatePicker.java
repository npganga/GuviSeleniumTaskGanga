package task20SeleniumWebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		 
		//Initialization
		WebDriver driver = new ChromeDriver();
						
		//Launch URL
		driver.get("https://jqueryui.com/datepicker/");
						
		//Maximize the screen
		driver.manage().window().maximize();
						
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		//Switch to frame
		driver.switchTo().frame("demo-frame");
		
		//select date field
		driver.findElement(By.xpath("//input[@id='datepicker']"));
	}

}
