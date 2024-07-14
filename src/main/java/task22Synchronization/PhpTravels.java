package task22Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        WebElement Element = driver.findElement(By.xpath("//strong[text()='Demo Request Form']"));
        	
        //Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        //Pass the value to FirstName field
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Anu");
      
        //Pass the value to Lastname field
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Super");
      
        //Pass the value to Business Name field
        driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("SuperMario");
      
        //Pass the value to Email field
        driver.findElement(By.xpath("//input[@class='email form-control']")).sendKeys("abc123@gmail.com");
      
        //Pass value for the whatsapp number field
        driver.findElement(By.xpath("//input[@name='whatsapp']")) .sendKeys("8765456789");     
        
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
        
        //Verify the submit button is visible
     
        //Locating element by link text and store in variable "Element"        		
        WebElement SubmitElement = driver.findElement(By.xpath("//button[@id='demo']"));
        	
        //Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", SubmitElement);
        
        //Click Submit button
        SubmitElement.click();
        
        // Step 1: Set the time duration for explicit wait
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     		
     	// Step 2: Condition to wait
     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon--order-success svg']")));
     		
     	//Registration Success message is displayed
     	Boolean verifySuccess =driver.findElement(By.xpath("//strong[text()=' Thank you!']")).isDisplayed();
     	   
     	//verify the registration success message is displayed
     	if(verifySuccess = true) {
     	   System.out.println("Registration is successful");
        }
     	    
       else
       {
           System.out.println("Registration is not successful");
       }
		
	  //Screenshot of message 
     	try {	
      //Capture screenshot
      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		  
      //Mention the destination file path
      File destination = new File("D:\\Softwares\\GuviWorkspace1\\SampleProjects\\src\\main\\resources\\Screenshots\\day22ss.png");
      
      //Move Source to Destination
      
		FileUtils.copyFile(source, destination);
	} 
     	catch (IOException e) {
		e.printStackTrace();
	}
      
     
		
	}
}
