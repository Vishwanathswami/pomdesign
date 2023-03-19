package mainjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement txtPage;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	List<WebElement> box;
	
	@FindBy(xpath="//*[@type='checkbox']")
	List<WebElement> bxex;
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String titltofPage() {
	return	txtPage.getText();
	}
	
	public void checkboxes() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		box.get(0).click();
	}
	
	public boolean chkbxselect() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return	bxex.get(0).isSelected();
	}
	
	
}
