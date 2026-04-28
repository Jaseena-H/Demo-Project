package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import pages.ManageNewsPage;
import utilities.ExcelUtilityClass1;

public class ManageNewsTest extends BaseClass2

{
	HomePage homepage;
	ManageNewsPage newspage;
	@Test(description="Add news text")
public void verifyTheAdminIsAbleToAddNews() throws IOException


{
	 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
     LoginPage loginpage=new LoginPage(driver);
     loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
    // loginpage.enterPassword(passwordvalue);
     homepage=loginpage.clickOnSignIn();
     
     
     String newsvalue= ExcelUtilityClass1.getStringData(0, 1, "managenewspage");
     
   //  ManageNewsPage newspage=new ManageNewsPage(driver);
    newspage= homepage.clickOnManageNewsMoreInfoBtn();
     newspage.clickOnNewBtn().enterNewNewsText(newsvalue).clickSaveBtn();
    // newspage.enterNewNewsText(newsvalue);
    // newspage.clickSaveBtn();
     boolean alertmsg=newspage.alertMessageIsDisplayed();
     Assert.assertTrue(alertmsg);
     
     
     /*LogoutPage logoutpage=new LogoutPage(driver);
     
     //logoutpage.enterUserName(usernamevalue);
     //logoutpage.enterPassword(passwordvalue);
    // logoutpage.clickOnSignIn();
     logoutpage.clickProfile();
     logoutpage.clickLogout();*/
     
    
     
}
}