package com.usm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.usm.qa.base.TestBase;
import com.usm.qa.pages.HomePage;
import com.usm.qa.pages.LoginPage;
import com.usm.qa.pages.StonesPage;

public class StonesPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StonesPage stonesPage;
	
	// call super class constructor - from Base class
	public StonesPageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser 
	
	@BeforeMethod
	public void setUp() {
	initialization(); 	// initialize property 
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	stonesPage = new StonesPage();
	}
	
	@Test(priority=1)
	public void verifyAdvancedFilterLink() {
		Assert.assertEquals(true, stonesPage.validateAdvancedFiltersLink());
	}
	
	@Test(priority=2)
	public void verifyNewButtonLink() {
		Assert.assertEquals(true, stonesPage.validateNewButtonLink());
	}
	
	@Test(priority=3)
	public void verifyOrderLink() {
		Assert.assertEquals(true, stonesPage.validateOrderButtonLink());
	}
	
	@Test(priority=4)
	public void verifyExportButtonLink() {
		Assert.assertEquals(false, stonesPage.validateExportButtonLink());
	}
	
	@Test(priority=5)
	public void verifyClearButton() {
		Assert.assertEquals(true, stonesPage.validateClearButton());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
