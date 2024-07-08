package task19SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guviSignupPage {

	public static void main(String[] args) {
		
		//Initialization
		WebDriver driver = new ChromeDriver();
		
		//Determine the type of locator
		int value=5;//Value 1- id; 2-ClassName; 3-TagName; 4-CSS Selector; 5-Xpath;
		
		//Launch URL
		driver.get("https://www.guvi.in/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//Click Signup button 
		driver.findElement(By.linkText("Sign up")).click();
		
		//Verify Sign up is open
		WebElement signupPage = driver.findElement(By.xpath("//div[@class='sign-up-form signup-custom-w']"));
		
		if(signupPage.isDisplayed()) {
			System.out.println("The Signup page is loaded");
		}
		else {
			driver.close();
		}
		if(value==1) /*Id Locator*/{
		//Passing value for Fullname Field
		driver.findElement(By.id("name")).sendKeys("Test");
		
		//Passing value for Email field
		driver.findElement(By.id("email")).sendKeys("abc123def@gmail.com");
		
		//Passing value for Password field
		driver.findElement(By.id("password")).sendKeys("Qwerty@123");
		
		//Passing value for Mobilenumber field
		driver.findElement(By.id("mobileNumber")).sendKeys("8765445678");
		
		//Passing value for Signup button
		driver.findElement(By.id("signup-btn")).click();
		}
		
		else if(value==2) /*ClassName Locator*/ {
			
		//Passing value for Fullname Field
		driver.findElements(By.className("form-control")).get(0).sendKeys("Test");
		
		//Passing value for Email field
		driver.findElements(By.className("form-control")).get(1).sendKeys("abc1234def@gmail.com");
				
		//Passing value for Password field **As Class name has space inbetween, It cannot be used by className locator**
		//driver.findElement(By.className("form-control password-err")).sendKeys("Qwerty@123");
				
		//Passing value for Mobilenumber field **As Class name has space inbetween, It cannot be used by className locator**
		//driver.findElement(By.className("form-control countrycode-left")).sendKeys("8765445678");
				
		//Passing value for Signup button **As Class name has space inbetween, It cannot be used by className locator**
		//driver.findElement(By.className("btn signup-btn")).click();
		
		}
		
		else if(value==3) /*TagName Locator*/{
			//Passing value for Fullname Field
			driver.findElements(By.tagName("input")).get(0).sendKeys("Test");
			
			//Passing value for Email field
			driver.findElements(By.tagName("input")).get(1).sendKeys("abc1234def@gmail.com");
			
			//Passing value for Password field
			driver.findElements(By.tagName("input")).get(2).sendKeys("Qwerty@123");
			
			//Passing value for Mobilenumber field
			driver.findElements(By.tagName("input")).get(3).sendKeys("8765445678");
			
			//Passing value for Signup button
			driver.findElements(By.tagName("a")).get(2).click();
			}
		else if(value==4) /*CSS Selector Locator*/{
			//Passing value for Fullname Field by Id
			driver.findElement(By.cssSelector("input#name")).sendKeys("Test");
			
			//Passing value for Email field by Id
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc1235def@gmail.com");
			
			//Passing value for Password field by Id
			driver.findElement(By.cssSelector("input#password")).sendKeys("Qwerty@123");
			
			//Passing value for Mobilenumber field by Id
			driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("8765445678");
			
			//Passing value for Signup button by Class ** as the space in class attribute is replaced by .
			driver.findElement(By.cssSelector("a.btn.signup-btn")).click();
			}
		else if(value==5) /*Xpath Locator*/{
			//Passing value for Fullname Field 
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test");
			
			//Passing value for Email field
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc12378def@gmail.com");
			
			//Passing value for Password field
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwerty@123");
			
			//Passing value for Mobilenumber field
			driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8765445678");
			
			//Passing value for Signup button
			driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
			}
		else {
			System.out.println("Not a valid value ");
		}
	driver.close();
	}

}
