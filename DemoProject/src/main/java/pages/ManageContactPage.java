package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageContactPage 
{
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	WebElement manageinfobtn;
	
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	WebElement actionbtn;
	
	@FindBy(xpath = "//input[@id='phone' and @name='phone']")
	WebElement phonenumber;
	
	@FindBy(xpath = "//input[@id='email'and @name='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info' and @name='Update']")
	WebElement updatebtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	
	
	public WebDriver driver;

    public ManageContactPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnManageInfoBtn()
    {
        manageinfobtn.click();
    }
    
    public void clickOnActionBtn()
    {
        actionbtn.click();
    }
    
    public void enterPhoneNumber(String phonenumbervalue)
    {
        phonenumber.clear();
        phonenumber.sendKeys(phonenumbervalue);
    }
    
    public void enterEmail(String emailidvalue)
    {
        emailid.clear();
        emailid.sendKeys(emailidvalue);
    }
    
    public void clickOnUpdateBtn()
    {
        updatebtn.click();
    }
    
    public boolean alertMessageIsDisplayed() 
    {
        Assert.assertTrue(alertmsg.isDisplayed(), 
                "Expected success alert message is displayed for contact update");
        return true;
    }
}




