package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilityClass1;
import utilities.PageUtility;

public class AdminUsersTest extends BaseClass2

{
	@Test
	public void verifyThatTheUserCanUpdateAdminUserInfo() throws IOException


	{
		 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
	     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
	     
	     LoginPage loginpage=new LoginPage(driver);
	     loginpage.enterUserName(usernamevalue);
	     loginpage.enterPassword(passwordvalue);
	     loginpage.clickOnSignIn();
	     
	     
	     AdminUsersPage usertype=new AdminUsersPage(driver);
	     
	     usertype.clickOnManageInfoBtn();
	     usertype.clickOnNewBtn();
	     usertype.enterUserName(usernamevalue);
	     usertype.enterPassword(passwordvalue);
	     usertype.selectUserTypeBtn("partner");
	    
	     //boolean alertmsg=usertype.alertMessageIsDisplayed();
	    // Assert.assertTrue(alertmsg);

}
}
