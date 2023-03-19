package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	// All locators of page at topmost

	@FindBy(xpath = "//*[@name='username']")
	WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	WebElement password;

	@FindBy(xpath="//*[text()=' Login ']")
    WebElement  btn ;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;

	// Initilisation of locators/variables

	public LoginPage(WebDriver driver) {
	this.driver=driver; 
	PageFactory.initElements(driver, this);
	}
	
	
	//methods required for perform test
	
	public void loginMethod() {
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btn.click();
	}
	
	public String titleLoginPage() {
		return txtLoginPage.getText();
	}
	
	public String currentyrl() {
		return driver.getCurrentUrl();
	}

	
}
