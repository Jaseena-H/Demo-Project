package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilityClass1;

public class ManageCategoryTest extends BaseClass2

{
	@Test
	public void verifyThatTheUserCanUpdateCategoryInfo() throws IOException


	{
		 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
	     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
	     
	     LoginPage loginpage=new LoginPage(driver);
	     loginpage.enterUserName(usernamevalue);
	     loginpage.enterPassword(passwordvalue);
	     loginpage.clickOnSignIn();
	     
	     String categoryvalue= ExcelUtilityClass1.getStringData(0, 0, "managecategorypage");
	     
	     ManageCategoryPage categorydata=new ManageCategoryPage(driver);
	     
	     categorydata.clickOnManageInfoBtn();
	     categorydata.clickOnNewBtn();
	     categorydata.enterCategoryName(categoryvalue);
	     categorydata.clickSelectGroupsDiscountBox();
	     categorydata.clickSelectGroupsDiscountBtn();
	     categorydata.clickChooseFileBtn();
	     categorydata.clickOnSaveBtn();
	     //categorydata.alertMessageIsDisplayed();
	     
	     
	     boolean alertmsg=categorydata.alertMessageIsDisplayed();
	     Assert.assertTrue(alertmsg);

	   
}
}
