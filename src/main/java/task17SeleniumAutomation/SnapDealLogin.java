package task17SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealLogin {

	public static void main(String[] args) {
				//Initialization
				WebDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("http://www.snapdeal.com");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
				
	}

}
