package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
	
	public void clickOnAdminIcon() {
		
		adminicon.click();
	}
	
	public void clickOnLogOut() {
		
		logout.click();
	}
	
	
	
	

}
