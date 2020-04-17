package com.usm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.usm.qa.base.TestBase;
import com.usm.qa.pages.HomePage;
import com.usm.qa.pages.LoginPage;
import com.usm.qa.pages.NewStonePage;
import com.usm.qa.pages.StonesPage;
import com.usm.qa.util.TestUtil;

public class NewStonePageTest_V2 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StonesPage stonesPage;
	NewStonePage newstonePage;
	TestUtil testUtil;
	String sheetName = "TestData";

	// call super class constructor - from Base class
	public NewStonePageTest_V2() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void setUp() {
		initialization(); // initialize property
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		stonesPage = new StonesPage();
		newstonePage = new NewStonePage();

	}

	@DataProvider
	public String[][] getNewStoneTestData() {
		String xlTestData[][] = TestUtil.getTestData(sheetName);
		// System.out.println("under get data");
		// System.out.println(xlTestData);
		return xlTestData;

	}

	@Test(priority = 1, dataProvider = "getNewStoneTestData")
//	@Test(priority=1)
	public void validateCreateNewStone(String Ownername, String StockID, String Carat, String Shape, String LotID,
			String Comment, String Program, String Labname, String Cert, String Cut, String Color, String Clarity,
			String Polish, String Symmetry, String Fluorescence, String Fluorescencecolor, String DimensionWidth,
			String DimensionLength, String DimensionDepth, String Result) throws InterruptedException {

		newstonePage.clickonNewStoneButtonLink();
		testUtil.switchToFrame();

		newstonePage.createNewStone(Ownername, StockID, Carat, Shape, LotID, Comment, Program, Labname, Cert, Cut,
				Color, Clarity, Polish, Symmetry, Fluorescence, Fluorescencecolor, DimensionWidth, DimensionLength,
				DimensionDepth, Result);
		// newstonePage.verifyStonesave();

	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}
}
