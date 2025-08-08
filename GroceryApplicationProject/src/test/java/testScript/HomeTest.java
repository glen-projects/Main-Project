package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
	@Test(description = "Verify whether user is able to successfully logout")
	public void verifyWhetherUserIsAbleToSuccessfullyLogout() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminIcon();
		homepage.clickOnLogOut();
		
	}

}
