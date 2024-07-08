package task21SeleniumWindowsAndFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesHerokuapp {

	public static void main(String[] args) {
		
		//Initialization
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Switch to top frame
		driver.switchTo().frame("frame-top");
		
		//Verification of number of frames under top frame
		System.out.println("The number of child frames in the Top Frame is : "+driver.findElements(By.xpath("//frame")).size());
		
		//Switch to left frame
		driver.switchTo().frame("frame-left");
		
		//Get the text in the left frame 
		String LeftFrameName= driver.findElement(By.xpath("//body")).getText();

		//Verify the text in the left frame
		if(LeftFrameName.equals("LEFT")) {
		System.out.println("The Text in Left Frame is: "+LeftFrameName+ ". Hence Verified");
		}
		
		//Switch back to top frame
		driver.switchTo().parentFrame();
		
		//Switch to left frame
		driver.switchTo().frame("frame-middle");
				
		//Get the text in the left frame 
		String MiddleFrameName= driver.findElement(By.xpath("//body")).getText();

		//Verify the text in the left frame
		if(MiddleFrameName.equals("MIDDLE")) {
		System.out.println("The Text in Middle Frame is: "+MiddleFrameName+ ". Hence Verified");
		}	
		
		//Switch back to top frame
		driver.switchTo().parentFrame();
				
		//Switch to left frame
		driver.switchTo().frame("frame-right");
						
		//Get the text in the left frame 
		String RightFrameName= driver.findElement(By.xpath("//body")).getText();

		//Verify the text in the left frame
		if(RightFrameName.equals("RIGHT")) {
		System.out.println("The Text in Right Frame is: "+RightFrameName+ ". Hence Verified");
		}
		
		//Switch back to top frame
		driver.switchTo().parentFrame();
		
		//Switch back to page
		driver.switchTo().defaultContent();
		
		//Switch to Bottom frame
		driver.switchTo().frame("frame-bottom");
		
		//Get the text in the left frame 
		String BottomFrameName= driver.findElement(By.xpath("//body")).getText();

		//Verify the text in the left frame
		if(BottomFrameName.equals("BOTTOM")) {
		System.out.println("The Text in Bottom Frame is: "+BottomFrameName+ ". Hence Verified");
		}
		
		//Switch back to page
		driver.switchTo().defaultContent();
		
		//Print the title of the page
		
		if(driver.getTitle().isEmpty()) {
			System.out.println("The Page Title is empty");
		}
		else {
		System.out.println("The title of the page is: "+driver.getTitle());
		}	
		
		//Close the window
		driver.close();
	}

}
