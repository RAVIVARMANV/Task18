package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 	WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
	        createAccountButton.click();
	        
	        WebElement FirstNameField = driver.findElement(By.name("firstname"));
	        FirstNameField.sendKeys("Test");
	        
	        WebElement SurnameField = driver.findElement(By.name("lastname"));
	        SurnameField.sendKeys("User");
	        
	        WebElement emailField = driver.findElement(By.name("reg_email__"));
	        emailField.sendKeys("sovol75494@seosnaps.com");
	        
	        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
	        reenter.sendKeys("sovol75494@seosnaps.com");
		
	        WebElement Password = driver.findElement(By.name("reg_passwd__"));
		
	        Password.sendKeys("Sovol@1987");
	        
	        WebElement birthDayDropdown = driver.findElement(By.id("day"));
	        
	        birthDayDropdown.sendKeys("12");
	        
	        WebElement birthmonthDropdown = driver.findElement(By.id("month"));
	        
	        birthmonthDropdown.sendKeys("Dec");
	        
	        WebElement birthYearDropdown = driver.findElement(By.id("year"));
	        birthYearDropdown.sendKeys("1975");

	        WebElement gender = driver.findElement(By.cssSelector("input[name='sex'][value='2']")); // Assuming male
	        gender.click();
	        
	        WebElement signUpButton = driver.findElement(By.name("websubmit"));
	        
	       
	        signUpButton.click();
	        if (!driver.getCurrentUrl().equals("https://www.facebook.com/")) {
	            System.out.println("Failed to register on Facebook.");
	        } else {
	            System.out.println("Successfully registered on Facebook.");
	        } 
	        
	}

}
