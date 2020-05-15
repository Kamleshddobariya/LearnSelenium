package com.pm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pm.qa.base.TestBase;
import com.pm.qa.pages.HomePage;
import com.pm.qa.pages.LoginPage;
import com.pm.qa.pages.NewProgramPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	NewProgramPage newprogramPage;

	// call super class constructor - from Base class
	public HomePageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void setUp() {
		initialization(); // initialize property
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1, enabled = false)
	public void verifySearchByProgramName() throws Exception {

		homePage.clickInSearchBox();
		homePage.enterSearchProgram(NewProgramPage.myProgramName);
//		Assert.assertEquals(homePage.verifySearchSucessfully(), "AccessManagerChanges");

		System.out.println("Recently created program name: " + NewProgramPage.myProgramName);
		homePage.enterSearchProgram(NewProgramPage.myProgramName);

		System.out.println("Searched program name: " + homePage.verifySearchSucessfully());

		Assert.assertEquals(homePage.verifySearchSucessfully(), NewProgramPage.myProgramName);

	}

	@Test(priority = 2, enabled = true)
	public void verifyEditProgram() throws Exception {

		homePage.clickInSearchBox();
		homePage.enterSearchProgram(NewProgramPage.myProgramName);

		homePage.clickOnEditProgram();
		homePage.clickOnProgramDeactive();

		homePage.clickOnEditProgramScope();
		homePage.clickOnProgramLocation();
		homePage.chooseProgramLocation();
		homePage.clickOnSaveScope();

		homePage.saveProgram();
		homePage.clickOnEditProgram();

		homePage.clickOnEditProgramScope();
		homePage.verifyProgramLocation();
		System.out.println(homePage.verifyProgramLocation());

		Assert.assertEquals(homePage.verifyProgramLocation(), "China");
		
		homePage.clickOnSaveScope();
		homePage.clickOnProgramActive();
		homePage.saveProgram();
		
	}

	@Test(priority = 3, enabled = false)
	public void verifyDeleteProgram() throws Exception {

		homePage.clickInSearchBox();
		homePage.enterSearchProgram(NewProgramPage.myProgramName);

		homePage.clickOnEditProgram();
		homePage.clickOnProgramDeactive();
		homePage.saveProgram();

		homePage.deleteProgram();
		System.out.println(homePage.verifyDeleteProgramSuccessfully());

		Assert.assertEquals(homePage.verifyDeleteProgramSuccessfully(),
				"program " + NewProgramPage.myProgramName + " has been deleted successfully");

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
