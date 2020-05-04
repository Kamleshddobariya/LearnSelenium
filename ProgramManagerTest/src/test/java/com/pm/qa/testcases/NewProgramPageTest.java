package com.pm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pm.qa.base.TestBase;
import com.pm.qa.pages.HomePage;
import com.pm.qa.pages.LoginPage;
import com.pm.qa.pages.NewProgramPage;

public class NewProgramPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	NewProgramPage newprogramPage;
	
	// call super class constructor - from Base class
	public NewProgramPageTest() {
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
	newprogramPage = new NewProgramPage();
	}
	
	
	@Test(priority=1) 
	public void verifyCreateNewProgram() throws Exception {
		
		newprogramPage.clickNewProgram();
		newprogramPage.enterProgramName();
		
		newprogramPage.createNewBundle();
		newprogramPage.enterBundleName();
		
		newprogramPage.createNewTemplateList();
		newprogramPage.selectTemplateTypeDD();
		newprogramPage.clickOnTemplateApplyDD();
		
		newprogramPage.clickOnBundleActive();
		newprogramPage.clickOnApplyBundle();
		
		newprogramPage.createNewMemberAccountList();
		newprogramPage.selectMemberAccount();
		
		newprogramPage.selectPRPrintShop();
		
	}
	
	
	@AfterMethod
	public void tearDown( ) {
		//driver.quit();
	}
	
}
