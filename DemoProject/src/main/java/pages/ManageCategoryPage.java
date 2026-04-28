package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import constant.ConstantClass;
import utilities.PageUtility;

public class ManageCategoryPage 

{
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")
	WebElement manageinfobtn;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add' and @onclick='click_button(1)']")
	WebElement newbtn;
	
	
	@FindBy(xpath = "//input[@id='category' and @name='category']")
	WebElement category;
	
	@FindBy(xpath = "//ul[@class=\"ms-list\" and @tabindex=\"-1\"]")
	WebElement selectgroupsbox;
	
	@FindBy(xpath = "//li[@class='ms-elem-selectable ms-hover']")
	WebElement selectgroupsbtn;
	
	@FindBy(xpath = "//input[@id='main_img' and@type='file']")
	WebElement choosefilebtn;
	
	@FindBy(xpath = "//button[@class='btn btn-danger' and @name='create']")
	WebElement savebtn;
	
	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	WebElement alertmsg;
	
	public WebDriver driver;
	PageUtility pageutility;

	public ManageCategoryPage(WebDriver driver)

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
	
	public void clickOnNewBtn()

	{
		newbtn.click();

	}
	
	public void enterCategoryName(String categoryvalue)

	{
		
		category.sendKeys(categoryvalue);

	}
	
	public void clickSelectGroupsDiscountBox()

	{
		selectgroupsbox.click();

	}
	
	public void clickSelectGroupsDiscountBtn()

	{
		selectgroupsbtn.click();

	}
	
	public void clickChooseFileBtn()

	{
		//choosefilebtn.click();
		choosefilebtn.sendKeys(ConstantClass.IMAGEFILE);

	}
	
	public void clickOnSaveBtn()

	{
		savebtn.click();

	}
	
	public boolean alertMessageIsDisplayed() 
	{
		Assert.assertTrue(alertmsg.isDisplayed(), "Expected alert message is  displayed for successful News addition");
		return true;
	}
}
