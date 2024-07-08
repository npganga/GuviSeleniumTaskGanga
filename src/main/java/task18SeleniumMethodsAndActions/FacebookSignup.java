package task18SeleniumMethodsAndActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) {
		
		
				//WebDriver Interface Initialization
				WebDriver driver = new ChromeDriver();
				
				
				//Launch URL
				driver.get("https://www.facebook.com/");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
				//Click Create New Account button 
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				
				//Enter FirstName
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");

				//Enter SurName
				driver.findElement(By.xpath(null));
	}

}
