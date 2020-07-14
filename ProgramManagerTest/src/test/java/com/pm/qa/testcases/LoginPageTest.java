package com.pm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pm.qa.base.TestBase;
import com.pm.qa.pages.HomePage;
import com.pm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	// call super class constructor - from Base class
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization(); // initialize property
		loginPage = new LoginPage();
	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginWithValidUsernamePassword() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		System.out.println(homePage.validateLoginConfirmation());
//		Assert.assertEquals(homePage.validateLoginConfirmation(), prop.getProperty("loginConfirmation"));
		
		System.out.println(homePage.validateLoginConfirmationByUserName());
		Assert.assertEquals(homePage.validateLoginConfirmationByUserName(), prop.getProperty("loginConfirmationByUsername"));
	}

	@Test(priority = 2, enabled = true)
	public void verifyLoginWithInvalidUsername() {
		homePage = loginPage.login(prop.getProperty("invalidUsername"), prop.getProperty("password"));
		System.out.println(loginPage.validateInCorrectLogin());
		Assert.assertEquals(loginPage.validateInCorrectLogin(), prop.getProperty("inCorrectLoginMessage"));
	}

	@Test(priority = 3, enabled = true)
	public void verifyLoginWithInvalidPassword() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("invalidPassword"));
		System.out.println(loginPage.validateInCorrectLogin());
		Assert.assertEquals(loginPage.validateInCorrectLogin(), prop.getProperty("inCorrectLoginMessage"));
	}

	@Test(priority = 4, enabled = true)
	public void verifyLoginWithEmptyUsername() {
		homePage = loginPage.login(prop.getProperty("emptyUsername"), prop.getProperty("password"));
		System.out.println(loginPage.validateLoginWithEmptyUsername());
		Assert.assertEquals(loginPage.validateLoginWithEmptyUsername(), prop.getProperty("emptyusernameMessage"));
	}

	@Test(priority = 5, enabled = true)
	public void verifyLoginWithEmptyPassword() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("emptyPassword"));
		System.out.println(loginPage.validateLoginWithEmptyPassword());
		Assert.assertEquals(loginPage.validateLoginWithEmptyPassword(), prop.getProperty("emptypasswordMessage"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
