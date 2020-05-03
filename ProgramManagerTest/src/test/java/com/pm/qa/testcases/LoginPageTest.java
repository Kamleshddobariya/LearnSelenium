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
	public void verifyCorrectLogin() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(homePage.validateLoginConfirmation());
		Assert.assertEquals(homePage.validateLoginConfirmation(), prop.getProperty("loginConfirmation"));
	}

	@Test(priority = 2)
	public void verifyInCorrectLogin() {
		homePage = loginPage.login(prop.getProperty("invalidUsername"), prop.getProperty("password"));
		System.out.println(loginPage.validateInCorrectLogin());
		Assert.assertEquals(loginPage.validateInCorrectLogin(), prop.getProperty("inCorrectLoginMessage"));
	}

	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}

}
