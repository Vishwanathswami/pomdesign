package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
		
	
	@Test(priority = 2)
	public void verifyPimPage() {
		loginPage.loginMethod();
		Assert.assertEquals(pimPage.titltofPage(), "PIM");
	}
	
	@Test(priority = 3)
	public void verifycheckboxisSelected() {
		pimPage.checkboxes();
		Assert.assertEquals(pimPage.chkbxselect(), true);
	
	
	}
}
