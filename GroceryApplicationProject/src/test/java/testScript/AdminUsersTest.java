package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminUsersTest extends Base{
	
	@Test(description = "Verify whether user is able to create new user")
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
		
		RandomDataUtility random = new RandomDataUtility();
		String adminusername1= random.createRandomUserName();
		String adminpassword1=random.createRandomPassword();
		String usertype=ExcelUtility.getStringData(0, 2, "AdminPage");
		
		
		adminpage.enterAdminUserNameOnUserNameField(adminusername1);
		adminpage.enterAdminPasswordOnPasswordField(adminpassword1);
		adminpage.selectUserType(usertype);
		adminpage.clickOnCreateButton();
		
		
	}
	
	@Test(description = "Verify whether user is able to search user")
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
	
	@Test(description="Verify whether user is able to reset")
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
