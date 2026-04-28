package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage

{
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement errorMsg;
	@FindBy(xpath = "//span[text()='7rmart supermarket']")
	WebElement homePageHeading;

	public WebDriver driver;

	public LoginPage(WebDriver driver)

	{
		this.driver = driver;// assigning instance vairable to local
		PageFactory.initElements(driver, this);// pagefactory is class and initElements is the method used to initialise
												// the webelements

	}

	public LoginPage enterUserName(String usernamevalue)

	{
		username.sendKeys(usernamevalue);
		return this;

	}

	public LoginPage enterPassword(String passwordvalue)

	{

		password.sendKeys(passwordvalue);
		return this;
	}

	public HomePage clickOnSignIn()

	{
		/*
		 * WaitUtility waitutility=new WaitUtility();
		 * waitutility.waitForElementToBeClickable(driver, signin);
		 */
		signin.click();
		return new HomePage(driver);

	}

	public void errorMessageDisplay() {

		if (errorMsg.isDisplayed()) {
			System.out.println("Invalid credentials");
		} else {
			System.out.println("Login Successful");
		}
	}

	/*
	 * public void countrydropdown() { PageUtility pageutility=new PageUtility();
	 * pageutility.selectByVisibleTextMethod(country, "India"); }
	 */
	public boolean isHomePageDisplayed() {
		return homePageHeading.isDisplayed();
	}

}
