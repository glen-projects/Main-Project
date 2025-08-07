package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
	
	@Test
	public void verifyWhetherUserIsAbleToCreateNewUser() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();

		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.clickOnMoreInfoButton();
		adminpage.clickOnNewButton();
		
		String adminusername1=ExcelUtility.getStringData(0, 0, "AdminPage");
		String adminpassword1=ExcelUtility.getStringData(0, 1, "AdminPage");
		String usertype=ExcelUtility.getStringData(0, 2, "AdminPage");
		
		
		adminpage.enterAdminUserNameOnUserNameField(adminusername1);
		adminpage.enterAdminPasswordOnPasswordField(adminpassword1);
		adminpage.selectUserType(usertype);
		adminpage.clickOnCreateButton();
		
		
	}
	
	@Test
	public void verifyWhetherUserIsAbleToSearchUser() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();

		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.clickOnMoreInfoButton();
		adminpage.clickOnSearchOption();
		
		String searchusername1=ExcelUtility.getStringData(0, 0, "AdminPage");
		String searchusertype=ExcelUtility.getStringData(0, 2, "AdminPage");
		adminpage.enterUserNameOnSearchSection(searchusername1);
		adminpage.clickOnSelectUserTypeOnSearchSection(searchusertype);
		adminpage.clickOnSearchButton();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToReset() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();

		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.clickOnMoreInfoButton();
		adminpage.clickOnResetButton();
		
	}
		

}
