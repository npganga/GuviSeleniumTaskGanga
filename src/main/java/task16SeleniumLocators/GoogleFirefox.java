package task16SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleFirefox {

	public static void main(String[] args) {
		//Initialization
				WebDriver driver = new FirefoxDriver();
				
				//Launch URL
				driver.get("http://google.com");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Print the URL of the currentPage
				System.out.println("The URL of the current Page is : "+driver.getCurrentUrl());
					
				//Reloads the Page
				driver.navigate().refresh();
				
				//Close the browser
				driver.quit();
				
	}

}
