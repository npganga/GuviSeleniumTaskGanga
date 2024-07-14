package task17SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealLogin {

	public static void main(String[] args) throws InterruptedException {
				
				//Initialization of WebDriver Interface
				WebDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("http://www.snapdeal.com");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
				WebElement signinClickable = driver.findElement(By.xpath("//div[@class='accountInner']"));
		       
				Actions mouse =new Actions(driver);
		        
		        mouse.clickAndHold(signinClickable).perform();
		        
		        WebElement loginClickable =driver.findElement(By.xpath("//a[text()='login']"));
		       // mouse.moveToElement(loginClickable).perform();
		        
		        loginClickable.click();
		        
		        //Switch to Login Frame
		        driver.switchTo().frame("loginIframe");
		           
		     	//Pass the valid email address
		        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gangangptest@gmail.com");
		        
		        //Click the continue button
		        driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		        
		        //Pause the code, to Pass OTP 
		        Thread.sleep(10000);
		        
		        //Click the Continue button
		        driver.findElement(By.xpath("//button[@id='loginUsingOtp']")).click();
		        
		        //Switch back to top frame
				driver.switchTo().parentFrame();
		        	
		        //Verifying username is shown after login successfully
		        String VerifyLogin = driver.findElement(By.xpath("//div[@class='accountInner']//following::span[1]")).getText();
		        
		        if(VerifyLogin.equalsIgnoreCase("Ganga")) {
		        	System.out.println("Login is successful");
		        }
		        else {
		        	System.out.println("Login is not successful");
		        }	
		        
		        //Close the browser
		        driver.close();
	}

}
