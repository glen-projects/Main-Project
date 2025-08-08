package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageNews {
	
	WebDriver driver;
	public ManageNews(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and text()='More info ']") private WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") private WebElement managenewsnew;
	@FindBy(xpath="//textarea[@id='news']") private WebElement enternewtext;
	@FindBy(xpath="//button[@type='submit']") private WebElement submitnews;
	@FindBy(xpath="//a[@onclick='click_button(2)']") private WebElement searchoption;
	@FindBy(xpath="//input[@name='un']") private WebElement titletext;
	@FindBy(xpath="//button[@name='Search']") private WebElement submitbutton;
	
public void clickOnMoreInfoButton() {
		
		managenewsmoreinfo.click();
	}
	
	public void clickOnNewButton() {
		managenewsnew.click();
	}
	
	public void enterNewsInformationOnNewsField(String newsupdate) {
		
		enternewtext.sendKeys(newsupdate);
	}
	
	public void clickOnSubmitButtonOnEnterNewsSection() {
		
		submitnews.click();
	}
	
	public void clickOnSearchOption() {
		
		searchoption.click();
		
	}
	
	public void enterNewsTitle(String newsupdate) {
		
		titletext.sendKeys(newsupdate);
	}
	
	
	public void clickOnSearchButton() {
		
		submitbutton.click();
	}

}
