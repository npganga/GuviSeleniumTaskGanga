package task17SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealLogin {

	public static void main(String[] args) {
				
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
		        mouse.moveToElement(loginClickable).perform();
	}

}
