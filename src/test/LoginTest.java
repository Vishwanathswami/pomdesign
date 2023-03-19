package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLogin() {
	loginPage.loginMethod();
	Assert.assertEquals(pimPage.titltofPage(), "PIM");
	
	
	}
	@Test(priority=0)
	public void verifyLoginPageIsDisplayed() {
		
		Assert.assertEquals(loginPage.titleLoginPage(),"Login");
	}
	@Test(priority = -1)
	public void verifyurl() {
		Assert.assertEquals(loginPage.currentyrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	

}
