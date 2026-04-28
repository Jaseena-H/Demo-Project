package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.PageUtility;

public class AdminUsersPage 

{
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement manageinfobtn;
	

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @href='javascript:void(0)']")
	WebElement newbtn;
	

	@FindBy(xpath = "//select[@id='user_type' and @name='user_type']")
	WebElement selectuserdropdown;
	
	@FindBy(xpath = "//input[@id='username' and @name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password'and @name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger'and @name='Create']")
	WebElement savebtn;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertmsg;
	
	
	
	public WebDriver driver;
	PageUtility pageutility;

	public AdminUsersPage(WebDriver driver)

	{
		this.driver = driver;// assigning instance vairable to local
		PageFactory.initElements(driver, this);// pagefactory is class and initElements is the method used to initialise
												// the webelements
		pageutility = new PageUtility(driver);
	}

	public void clickOnManageInfoBtn()

	{
		manageinfobtn.click();

	}
	
	
	public void clickOnNewBtn()

	{
		newbtn.click();

	}
	
	public void enterUserName(String usernamevalue)

	{
		username.sendKeys(usernamevalue);

	}
	
	public void enterPassword(String passwordvalue)

	{

		password.sendKeys(passwordvalue);
		
	}
	
	public void selectUserTypeBtn(String usertype)
    {
        pageutility.selectByValueMethod(selectuserdropdown, usertype);
    }

	public boolean alertMessageIsDisplayed() {
		Assert.assertTrue(alertmsg.isDisplayed(), "Expected alert message is  displayed for successful News addition");
		return true;
	}
}





