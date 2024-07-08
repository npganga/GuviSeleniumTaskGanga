package DemoBlazeTask;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoBlaze {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.demoblaze.com/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click sign-in button
		driver.findElement(By.id("signin2")).click();
		
		//Send Username
		driver.findElement(By.id("sign-username")).sendKeys("Aadmin");
		
		//Send Password
		driver.findElement(By.id("sign-password")).sendKeys("AAdmin123");
		
		//Click Sign-up button
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();

		//button[text()="Sign up"]
		
		//driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert(); // switch to alert

		//String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		//System.out.println(alertMessage); // Print Alert Message
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		alert.accept();
	}

}
