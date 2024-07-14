package task18SeleniumMethodsAndActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AnuTest");

				//Enter SurName
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
				
				//Enter EmailAddress
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testuser123@test.com");
				
				//Enter Password
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@123User");
				
				//Confirm EmailAddress
				driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testuser123@test.com");
				
				//Set Date of Birth
				
				//Set Date
				WebElement DateDropDown = driver.findElement(By.xpath("//select[@name='birthday_day']"));  
				Select date = new Select(DateDropDown);  
				date.selectByVisibleText("31");
				
				//Set Month
				WebElement MonthDropDown = driver.findElement(By.xpath("//select[@name='birthday_month']"));  
				Select month = new Select(MonthDropDown);  
				month.selectByVisibleText("May");
				
				//Set Month
				WebElement YearDropDown = driver.findElement(By.xpath("//select[@name='birthday_year']"));  
				Select year = new Select(YearDropDown);  
				year.selectByVisibleText("1985");
				
				//Select Gender 
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				//Scroll down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				//Locating element by link text and store in variable "Element"        		
		        WebElement Element = driver.findElement(By.xpath("//button[@name='websubmit']"));

		        //Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        
				//Click Submit button
				driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
