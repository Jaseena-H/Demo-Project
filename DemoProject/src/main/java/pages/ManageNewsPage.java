package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageNewsPage

{
	//@FindBy(xpath = "//a[contains(@href,'list-news')]//i[@class='fas fa-arrow-circle-right']") 
	WebElement managenews;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news' and @ name='news']")
	WebElement enternews;
	@FindBy(xpath = "//button[@type='submit' and @ name='create']")
	WebElement savebtn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelbtn;

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver)

	{
		this.driver = driver;// assigning instance vairable to local
		PageFactory.initElements(driver, this);// pagefactory is class and initElements is the method used to initialise
												// the webelements

	}

	public void clickOnManageNewsMoreInfoBtn()

	{
		managenews.click();

	}

	public ManageNewsPage clickOnNewBtn()

	{
		newbutton.click();
		return this;

	}

	public ManageNewsPage enterNewNewsText(String newsvalue)

	{
		enternews.sendKeys(newsvalue);
		return this;

	}

	public ManageNewsPage clickSaveBtn()

	{
		savebtn.click();
		return this;

	}

	public boolean alertMessageIsDisplayed() {

		Assert.assertTrue(alertmsg.isDisplayed(), "Expected alert message is  displayed for successful News addition");
		return true;
	}

	public void ClickOnNewBtn() {
		// TODO Auto-generated method stub
		
	}

}
