package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	
	WebDriver driver;
	public AdminUserPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newadminuser;
	@FindBy(xpath="//input[@id='username']") private WebElement adminusername;
	@FindBy(xpath="//input[@id='password']") private WebElement adminpassword;
	@FindBy(xpath="//select[@id='user_type']") private WebElement dropdownElement;
	@FindBy(xpath="//button[@name='Create']") private WebElement create;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") private WebElement searchoption;
	@FindBy(xpath="//input[@id='un']") private WebElement searchusername;
	@FindBy(xpath="//select[@id='ut']") private WebElement searchdropdown;
	@FindBy(xpath="//button[@name='Search']") private WebElement searchbutton;
	@FindBy(xpath="//a[text()=' Reset']") private WebElement resetbutton;

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
	public void selectUserType(String usertype) {
		
		Select select = new Select(dropdownElement);
		select.selectByVisibleText(usertype);
	}
	
	public void clickOnCreateButton() {
		create.click();
	}
	
	public void clickOnSearchOption() {
		
		searchoption.click();
		
	}
	
	public void enterUserNameOnSearchSection(String searchusername1) {
		
		searchusername.sendKeys(searchusername1);
	}
	
	
	public void clickOnSelectUserTypeOnSearchSection(String searchusertype) {
		
		Select select = new Select(searchdropdown);
		select.selectByVisibleText(searchusertype);
		
	}
	
	public void clickOnSearchButton() {
		
		searchbutton.click();
	}
	
	public void clickOnResetButton() {
		
		resetbutton.click();
	}
	
	

}
