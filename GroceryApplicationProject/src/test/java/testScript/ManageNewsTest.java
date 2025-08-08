package testScript;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import automationCore.Base;

import pages.LoginPage;
import pages.ManageNews;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base {
	
	@Test(description = "Verify whether user is able to create new user")
	public void verifyWhetherUserIsAbleToCreateNewUser() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();

		ManageNews managenews = new ManageNews(driver);
		managenews.clickOnMoreInfoButton();
		managenews.clickOnNewButton();
				
		String newsupdate= ExcelUtility.getStringData(0, 0, "ManageNews");
		managenews.enterNewsInformationOnNewsField(newsupdate);
		managenews.clickOnSubmitButtonOnEnterNewsSection();
		
		
	}
	
	@Test(description= "Verify whether user is able to search news")
	public void verifyWhetherUserIsAbleToSearchNews() throws IOException {
		
		String username1=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password1=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username1);
		loginpage.enterPasswordOnPasswordField(password1);
		loginpage.clickOnSignInButton();

		ManageNews managenews = new ManageNews(driver);
		managenews.clickOnMoreInfoButton();
		managenews.clickOnSearchOption();
		String newsupdate= ExcelUtility.getStringData(0, 0, "ManageNews");
		managenews.enterNewsTitle(newsupdate);
		managenews.clickOnSearchButton();
		
	}

}
