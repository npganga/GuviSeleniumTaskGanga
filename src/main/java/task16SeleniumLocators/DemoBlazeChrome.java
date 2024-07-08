package task16SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeChrome {

	public static void main(String[] args) {
				//Initialization
				WebDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("https://www.demoblaze.com/");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
				String titleOfThePage = driver.getTitle();
				
				if(titleOfThePage.equalsIgnoreCase("STORE")) {
					System.out.println("Page landed on correct website");
				}
				else {
					System.out.println("Page not landed on correct website");
				}
				
				//Close the browser
				driver.close();

	}

}
