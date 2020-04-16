package com.usm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.usm.qa.base.TestBase;
import com.usm.qa.pages.HomePage;
import com.usm.qa.pages.LoginPage;
import com.usm.qa.pages.NewStonePage;
import com.usm.qa.pages.StonesPage;
import com.usm.qa.util.TestUtil;

public class NewStonePageTest_V1 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StonesPage stonesPage;
	NewStonePage newstonePage;
	TestUtil testUtil;
	String sheetName = "TestData";
	String xlTestData [][] = TestUtil.getTestData(sheetName);
	
	// call super class constructor - from Base class
	public NewStonePageTest_V1() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser 
	
	@BeforeClass
	public void setUp() {
	initialization(); 	// initialize property
	testUtil = new TestUtil();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	stonesPage = new StonesPage();
	newstonePage = new NewStonePage();
	
	}
	
	@Test(priority=1)
	public void validateCreateNewStone() throws InterruptedException {
		
		
		String Ownername, StockID, Carat, Shape, LotID, Comment, Program, Labname, Cert, Cut, Color, Clarity, Polish, Symmetry, Fluorescence, Fluorescencecolor, DimensionWidth, DimensionLength, DimensionDepth, Result = null;
		for (int i = 0; i < TestUtil.TRowNum; i++) {
		
			Ownername = xlTestData[i][0];
			StockID = xlTestData[i][1];
			Carat = xlTestData[i][2];
			Shape = xlTestData[i][3];
			LotID = xlTestData[i][4];
			Comment = xlTestData[i][5];
			Program = xlTestData[i][6];
			Labname	= xlTestData[i][7];
			Cert = xlTestData[i][8];
			Cut = xlTestData[i][9];
			Color =	xlTestData[i][10];
			Clarity = xlTestData[i][11];
			Polish = xlTestData[i][12];
			Symmetry = xlTestData[i][13];
			Fluorescence = xlTestData[i][14];
			Fluorescencecolor =	xlTestData[i][15];
			DimensionWidth = xlTestData[i][16];
			DimensionLength = xlTestData[i][17];
			DimensionDepth = xlTestData[i][18];
			
		newstonePage.clickonNewStoneButtonLink();
		testUtil.switchToFrame();
		
		xlTestData[i][19] = newstonePage.createNewStone(Ownername, StockID, Carat, Shape, LotID, Comment, Program, Labname, Cert, Cut, Color, Clarity, Polish, Symmetry, Fluorescence, Fluorescencecolor, DimensionWidth, DimensionLength, DimensionDepth, Result);
		newstonePage.verifyStonesave();
		}
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
