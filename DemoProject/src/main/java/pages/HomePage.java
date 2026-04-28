package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage


{
	@FindBy(xpath="//input[@name='username']")WebElement username;
    @FindBy(xpath="//input[@name='password']")WebElement password;
    @FindBy(xpath="//button[text()='Sign In']")WebElement signin;
    @FindBy(xpath="//a[@data-toggle='dropdown']")WebElement profile;
    @FindBy(xpath="//a[contains(@href,'/admin/logout')]")WebElement logout;
    
    
    @FindBy(xpath = "//a[contains(@href,'list-news')]//i[@class='fas fa-arrow-circle-right']") 
	WebElement managenews;
    
    public WebDriver driver;
    public HomePage(WebDriver driver)
    
    {
		this.driver=driver;//assigning instance vairable to local
		PageFactory.initElements(driver, this);//pagefactory is class and initElements is the method used to initialise the webelements
	
    }

    
    
    
    
    
    public ManageNewsPage verifyUserIsAbleToClickOnManageNewsMoreInfoBtn()

	{
		managenews.click();
		return new ManageNewsPage(driver);

	}
    
    
    
    
    
    
    
    
    
    
    
    
	  public void enterUserName(String usernamevalue)
    
    {
		  username.sendKeys(usernamevalue);
  	  
    }
    
    public void enterPassword(String passwordvalue)
    
    {
  	  
  	  password.sendKeys(passwordvalue);
    }

    public void clickOnSignIn()

    {
  	  signin.click();
	  
    }
    
    public void clickProfile()
    
    {
    	profile.click();
    }
    
    public void clickLogout()
    
    {
    	logout.click();
    }






	public ManageNewsPage clickOnManageNewsMoreInfoBtn() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
