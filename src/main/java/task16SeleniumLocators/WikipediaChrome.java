package task16SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaChrome {

	public static void main(String[] args) {
		//Initialization
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.wikipedia.org/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Artificial Intelligence in search query
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		//Click Serach button
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		//Click History
		driver.findElement(By.xpath("//a[@href='#History']")).click();
		
		//Title of the current Section
		WebElement HistorySection = driver.findElement(By.xpath("//span[@id='History']"));
		
		if(HistorySection.isDisplayed()) {
			System.out.println("The title of the section is: "+HistorySection.getText());
		}
		else
		System.out.println("History is not opened");
		
		//Close Browser
		driver.close();
		
	}

}
