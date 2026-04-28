package testscriptpackage2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;

import constant.ConstantClass;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass2 



{
	public WebDriver driver;
	public Properties properties;
	@Parameters("Browser")
	@BeforeMethod(alwaysRun = true)
	public void browserInitialisation(@Optional("Chrome") String Browser) throws Exception
	
	
{
		try {
			
			properties=new Properties();
			FileInputStream fileinputstream= new FileInputStream(ConstantClass.CONFIGFILE);
			properties.load(fileinputstream);
		    }
		
		catch(Exception e)
		
		{
			System.out.println(e);
		}
		
	   if(Browser.equalsIgnoreCase("Chrome"))
		   
	   {
		   driver=new ChromeDriver(); 
	   }
	   
	   else if(Browser.equalsIgnoreCase("Fire Fox"))
	   
	   {
		   driver=new FirefoxDriver();
	   }
	   
	   else if(Browser.equalsIgnoreCase("Edge"))
		   
	   {
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   throw new Exception("Invalid Browser");
	   }
	   
	//driver=new ChromeDriver();
	//driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	   driver.get(properties.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
	driver.manage().window().maximize();

}
	@AfterMethod(alwaysRun=true)
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility scrShot = new ScreenShotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
		}

	}
}
////
//