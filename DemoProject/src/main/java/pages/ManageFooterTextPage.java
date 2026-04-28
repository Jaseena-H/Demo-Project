package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.PageUtility;

public class ManageFooterTextPage 

{
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement manageinfobtn;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1'and @role='button']")
	WebElement actionbtn;
	
	@FindBy(xpath = "//textarea[@id='content' and @name='address']")
	WebElement addaddress;
	
	@FindBy(xpath = "//input[@id='email' and @name='email']")
	WebElement addemail;
	
	@FindBy(xpath = "//input[@id='phone' and @name='phone']")
	WebElement addphonemuber;
	
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info'and @name='Update']")
	WebElement updatebtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	

	
	public WebDriver driver;
	PageUtility pageutility;

	public ManageFooterTextPage(WebDriver driver)

	{
		this.driver = driver;// assigning instance vairable to local
		PageFactory.initElements(driver, this);// pagefactory is class and initElements is the method used to initialise
												// the webelements
		//pageutility = new PageUtility(driver);
	}

	public void clickOnManageInfoBtn()

	{
		manageinfobtn.click();

	}
	
	
	public void clickOnActionBtn()

	{
		actionbtn.click();

	}
	
	public void enterAddress(String addressvalue)

	{
		addaddress.clear();
		addaddress.sendKeys(addressvalue);

	}
	
	public void enterEmail(String emailvalue)

	{
		
		addemail.clear();
		addemail.sendKeys(emailvalue);

	}
	
	public void enterPhoneNumber(String phonenumbervalue)

	{
		addphonemuber.clear();
		addphonemuber.sendKeys(phonenumbervalue);
		
	}
	
	public void clickOnUpdateBtn()

	{
		updatebtn.click();

	}
	
	public boolean alertMessageIsDisplayed() 
	{
		Assert.assertTrue(alertmsg.isDisplayed(), "Expected alert message is  displayed for successful News addition");
		return true;
	}
}
