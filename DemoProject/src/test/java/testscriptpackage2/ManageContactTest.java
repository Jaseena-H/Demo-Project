package testscriptpackage2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilityClass1;

public class ManageContactTest extends BaseClass2

{
	
@Test

	public void verifyThatTheUserCanUpdateTheContactInfo() throws IOException


	{
		 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
	     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
	     
	     LoginPage loginpage=new LoginPage(driver);
	     loginpage.enterUserName(usernamevalue);
	     loginpage.enterPassword(passwordvalue);
	     loginpage.clickOnSignIn();
	     
	     
	     String phonenumbervalue= ExcelUtilityClass1.getStringData(0, 1, "managecontactpage");
	     String emailidvalue= ExcelUtilityClass1.getStringData(1, 1, "managecontactpage");
	     
	     ManageContactPage contactpage=new ManageContactPage(driver);
	     
	     contactpage.clickOnManageInfoBtn();
	     contactpage.clickOnActionBtn();
	     contactpage.enterPhoneNumber(phonenumbervalue);
	     contactpage.enterEmail(emailidvalue);
	     contactpage.clickOnUpdateBtn();
	    
	     boolean alertmsg=contactpage.alertMessageIsDisplayed();
	     Assert.assertTrue(alertmsg);

}
}
