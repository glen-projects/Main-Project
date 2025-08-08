package testScript;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	@Test(priority=1, description="Verify whether user is able to login with valid credentials")
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();
		boolean dashboarddisplay = loginpage.isDashboardDisplayed();
		Assert.assertTrue(dashboarddisplay, "User was unable to login with valid credentials");
	}
	
	@Test(priority=2, description="Verify whether user is able to login with valid username and invalid password")
	public void verifyLoginWithValidUsernameInvalidPassword() throws IOException
	{
		String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();
		String actual=loginpage.pageHeading();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected, "User was able to login with invalid password");
		
	}
	
	@Test(priority=3, description="Verify whether user is able to login with invalid username and valid password")
	public void verifyLoginWithIncorrectUsernameValidPassword() throws IOException
	{
		String username1=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();
	}
	
	@Test(priority=4, description="Verify whether user is able to login with invalid username and invalid password")
	public void verifyLoginWithInvalidUsernameAndPassword() throws IOException
	{
		String username1=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();
	}
	
	
	

}
