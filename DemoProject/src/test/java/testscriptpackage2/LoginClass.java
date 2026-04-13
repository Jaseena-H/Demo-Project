package testscriptpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginClass extends BaseClass2


{
	@Test
public void validcredentials()
{
	WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
    username.sendKeys("admin");

    // Locate password field
    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    password.sendKeys("admin");

    // Locate login button
    WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
    signin.click();
	
}
	
	@Test
	public void validusernamer()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    username.sendKeys("admin");

	    // Locate password field
	    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	    password.sendKeys("admin123");

	    // Locate login button
	    WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    signin.click();
	    
	    WebElement errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
	   
	    
	   if (errorMsg.isDisplayed()) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Login Successful");
        }

		
	}	
	
	@Test
	public void validpassword()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    username.sendKeys("admin123");

	    // Locate password field
	    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	    password.sendKeys("admin");

	    // Locate login button
	    WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    signin.click();
		
	    WebElement errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
		   
	    
		   if (errorMsg.isDisplayed()) {
	            System.out.println("Invalid UserName");
	        } else {
	            System.out.println("Login Successful");
	        }
	}
	
	@Test
	public void invalidcredentials()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    username.sendKeys("admin123");

	    // Locate password field
	    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	    password.sendKeys("admin123");

	    // Locate login button
	    WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    signin.click();
	    
	    WebElement errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
		   
	    
		   if (errorMsg.isDisplayed()) {
	            System.out.println("Invalid Credentials");
	        } else {
	            System.out.println("Login Successful");
	        }
		
	}

}