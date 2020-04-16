package com.usm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.usm.qa.base.TestBase;
import com.usm.qa.pages.HomePage;
import com.usm.qa.pages.LoginPage;
import com.usm.qa.pages.StonesGrid;
import com.usm.qa.pages.StonesPage;

public class StonesGridTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StonesPage stonesPage;
	StonesGrid stonesGrid;
	
	// call super class constructor - from Base class
	public StonesGridTest() {
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
	//stonesPage = new StonesPage();
	stonesGrid = new StonesGrid();
	}
	
	@Test(priority=1)
	public void verifySelectAllPageCheckbox() {
		Assert.assertEquals(false, stonesGrid.validateSelectAllPageCheckbox());
	}
	
	@Test(priority=2)
	public void verifyClickSelectAllPageCheckbox() throws InterruptedException {
		//Thread.sleep(3000);
		boolean flag = stonesGrid.ClickSelectAllPageCheckbox();
		Assert.assertTrue(flag,"checkbox is not checked");
		System.out.println(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
