package testscriptpackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass2 



{
	public WebDriver driver;
	@BeforeMethod
	
    public void browserInitialisation()

{
	   
	driver=new ChromeDriver();
	driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	driver.manage().window().maximize();

}
	//@AfterMethod
    public void browserQuitandClose()
    
   {
	   
        driver.quit();
		//driver.close();  
   }
}
