package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utilities.ExcelUtilityClass1;

public class LoginTest extends BaseClass2

{
//@Test(priority=1,groups= {"regression"},retryAnalyzer=retrypackage.retryClass.class)
	HomePage homepage;
@Test
     public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException
       {
         //String usernamevalue="admin";
         //String passwordvalue="admin";
         
         String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
         String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
         LoginPage loginpage=new LoginPage(driver);
         loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
        // loginpage.enterPassword(passwordvalue);
         homepage=loginpage.clickOnSignIn();
         boolean homePageHeading=loginpage.isHomePageDisplayed();
         Assert.assertTrue(homePageHeading);//hard assert
       }

/*@Test

    public void verifyUserIsAbleToLoginUsingValidUserName() throws IOException 
      {
   // String usernamevalue="admin";
   // String passwordvalue="admin123";
    
    
    String usernamevalue= ExcelUtilityClass.getStringData(2, 0, "loginpage");
    String passwordvalue=ExcelUtilityClass.getStringData(2, 1, "loginpage");
    LoginPage loginpage=new LoginPage(driver);
    loginpage.enterUserName(usernamevalue);
    loginpage.enterPassword(passwordvalue);
    loginpage.clickOnSignIn();
    loginpage.errorMessageDisplay();
      }
@Test

    public void verifyUserIsAbleToLoginUsingValidPassword() throws IOException
      {
    //String usernamevalue="admin123";
   // String passwordvalue="admin";
    
    
    String usernamevalue= ExcelUtilityClass.getStringData(3, 0, "loginpage");
    String passwordvalue=ExcelUtilityClass.getStringData(3, 1, "loginpage");
    LoginPage loginpage=new LoginPage(driver);
    loginpage.enterUserName(usernamevalue);
    loginpage.enterPassword(passwordvalue);
    loginpage.clickOnSignIn();
    loginpage.errorMessageDisplay();
      }

@Test

     public void verifyUserIsAbleToLoginUsingInValidCredentials() throws IOException
      {
   // String usernamevalue="admin123";
   // String passwordvalue="admin123";
    
    
    String usernamevalue= ExcelUtilityClass.getStringData(4, 0, "loginpage");
    String passwordvalue=ExcelUtilityClass.getStringData(4, 1, "loginpage");
    LoginPage loginpage=new LoginPage(driver);
    loginpage.enterUserName(usernamevalue);
    loginpage.enterPassword(passwordvalue);
    loginpage.clickOnSignIn();
    loginpage.errorMessageDisplay();
      }*/
}
