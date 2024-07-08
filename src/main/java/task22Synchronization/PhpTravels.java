package task22Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {

	public static void main(String[] args) {
		
		//Initialization of Webdriver instance
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://phptravels.com/demo/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//div[@class='border rounded-4 p-4 p-md-5']"));

        //Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        //Pass the value to FirstName field
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Test");
      
        //Pass the value to Lastname field
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Super");
      
        //Pass the value to Business Name field
        driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("SuperMario");
      
        //Pass the value to Email field
        driver.findElement(By.xpath("//input[@class='email form-control']")).sendKeys("abc123@gmail.com");
      
        //find the field of number 1 
        String num1 = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
        
        //find the field of number 2
        String num2 = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
        
        //Sum of 2 numbers
        int sum =Integer.valueOf(num1)+Integer.valueOf(num2);
        
        //Covert Int to String
        String sumString = String.valueOf(sum);
        
        //Pass the String value to result field
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys(sumString);
        
        //Click Submit button
        driver.findElement(By.xpath("//button[@id='demo']")).click();
        
        	// Step 1: Set the time duration
		
     		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     		
     		// Step 2: Condition to wait
     		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.border.rounded-4.p-4.p-md-5")));
     		
     		// Step 3: Perform your action
     	    String text = driver.findElement(By.cssSelector("h2.text-center.cw.mt-3")).getText();
     		
		//Verify the message
		////div[@class='completed'] //tag:contains("inner text") text-center cw mt-3
		//Boolean FinalText =driver.findElement(By.xpath("//h2[text()=' Thank you!']")).isDisplayed();
		System.out.println("Registration"+text);
		//if(FinalText.contains(" Thank you!")) {
		//	System.out.println("Registration is successfull");
		//}
		//else {
		//	System.out.println("Registration is not successfull"+FinalText);
		//}
		//Screenshot
		
	}
}
