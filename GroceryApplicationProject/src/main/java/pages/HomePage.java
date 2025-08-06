package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") private WebElement adminicon;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") private WebElement logout;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newadminuser;
	@FindBy(xpath="//input[@id='username']") private WebElement adminusername;
	@FindBy(xpath="//input[@id='password']") private WebElement adminpassword;
	@FindBy(xpath="//select[@id='user_type']") private WebElement dropdownElement;
	@FindBy(xpath="//button[@name='Create']") private WebElement create;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") private WebElement moreinfo;
	

	public void clickOnAdminIcon() {
		
		adminicon.click();
	}
	
	public void clickOnLogOut() {
		
		logout.click();
	}
	
	public void clickOnMoreInfoButton() {
		
		moreinfo.click();
	}
	
	public void clickOnNewButton() {
		newadminuser.click();
	}
	
public void enterAdminUserNameOnUserNameField(String adminusername1) {
		
		adminusername.sendKeys(adminusername1);
	}
	
	public void enterAdminPasswordOnPasswordField(String adminpassword1) {
		
		adminpassword.sendKeys(adminpassword1);
	}
	public void selectUserType() {
		
		Select select = new Select(dropdownElement);
		select.selectByVisibleText("Admin");
	}
	
	public void clickOnCreateButton() {
		create.click();
	}
	
	
	
	
	
	

}
