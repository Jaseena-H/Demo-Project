package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilityClass1;

public class ManageFooterTextTest extends BaseClass2


{
	@Test
	public void verifyThatTheUserCanUpdateFooterTextInfo() throws IOException


	{
		 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
	     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
	     
	     LoginPage loginpage=new LoginPage(driver);
	     loginpage.enterUserName(usernamevalue);
	     loginpage.enterPassword(passwordvalue);
	     loginpage.clickOnSignIn();
	     
	     String addressvalue= ExcelUtilityClass1.getStringData(0, 0, "footertextpage");
	     String emailvalue= ExcelUtilityClass1.getStringData(1, 0, "footertextpage");
	     String phonenumbervalue= ExcelUtilityClass1.getStringData(2, 0, "footertextpage");
	     ManageFooterTextPage footertype=new ManageFooterTextPage(driver);
	     
	     footertype.clickOnManageInfoBtn();
	     footertype.clickOnActionBtn();
	     footertype.enterAddress(addressvalue);
	     footertype.enterEmail(emailvalue);
	     footertype.enterPhoneNumber(phonenumbervalue);
	     footertype.clickOnUpdateBtn();
	     boolean alertmsg=footertype.alertMessageIsDisplayed();
	     Assert.assertTrue(alertmsg);

	   
}
}
