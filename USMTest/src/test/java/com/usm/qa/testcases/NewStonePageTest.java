package com.usm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.usm.qa.base.TestBase;
import com.usm.qa.pages.HomePage;
import com.usm.qa.pages.LoginPage;
import com.usm.qa.pages.NewStonePage;
import com.usm.qa.pages.StonesPage;
import com.usm.qa.util.TestUtil;

public class NewStonePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StonesPage stonesPage;
	NewStonePage newstonePage;
	TestUtil testUtil;
	
	String sheetName = "TestData";
	
	// call super class constructor - from Base class
	public NewStonePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser 
	
	@BeforeMethod
	public void setUp() {
	initialization(); 	// initialize property
	testUtil = new TestUtil();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	stonesPage = new StonesPage();
	newstonePage = new NewStonePage();
	}
	
	@DataProvider
	public Object[][] getNewStoneTestData() {
		Object data [][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	//Create one stone & close browser and start the second stone again.
	@Test(priority=1, dataProvider="getNewStoneTestData")
	public void validateCreateNewStone(String Ownername, String StockID, String Carat, String Shape,  String LotID, String Comment, String Program, String Labname, String Cert, String Cut, String Color, String Clarity, String Polish, String Symmetry, String Fluorescence, String Fluorescencecolor, String DimensionWidth, String DimensionLength, String DimensionDepth, String Result) throws InterruptedException {
		newstonePage.clickonNewStoneButtonLink();
		Thread.sleep(3000);
		testUtil.switchToFrame();
		//newstonePage.createNewStone("India_Profile_QA2", "POM29012020_2", "0.300", "Round");
		newstonePage.createNewStone(Ownername, StockID, Carat, Shape, LotID, Comment, Program, Labname, Cert, Cut, Color, Clarity, Polish, Symmetry, Fluorescence, Fluorescencecolor, DimensionWidth, DimensionLength, DimensionDepth, Result);
	}
	
//	@Test(priority=1)
//	public void validateCreateNewStone() {
//		newstonePage.clickonNewStoneButtonLink();
//		testUtil.switchToFrame();
//		newstonePage.createNewStone("India_Profile_QA2", "POM29012020_2", "0.300", "Round");
//	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
