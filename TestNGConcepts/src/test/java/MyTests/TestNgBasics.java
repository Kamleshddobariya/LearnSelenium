package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	// Annotation start with @
	//
	
//	BeforeSuite - setup system property for chrome
//	BeforeTest - launch chrome Browser
//	BeforeClass - login method
	
//	BeforeMethod - enter URL
//	Test >> testcase1 - Google Title Test
//	AfterMethod- Logout from app
	
//	BeforeMethod - enter URL
//	Test >> testcase2 - do something else
//	AfterMethod- Logout from app
	
//	BeforeMethod - enter URL
//	Test >> testcase3 - logo test
//	AfterMethod- Logout from app
	
//	AfterClass- Close Browser
//	AfterTest- deleteAllCookies

	// Pre-conditions annotations --starting with @Before
	@BeforeSuite // 1st Preference
	public void setUP() {
		System.out.println("BeforeSuite - setup system property for chrome");
	}

	@BeforeTest // 2nd Preference
	public void lunchBrwoser() {
		System.out.println("BeforeTest - launch chrome Browser");
	}

	@BeforeClass // 3rd Preference
	public void login() {
		System.out.println("BeforeClass - login method");
	}

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("BeforeMethod - enter URL");
	}

	// test cases -- starting with @Test
	@Test // 5
	public void testCase1() {
		System.out.println("Test >> testcase1 - Google Title Test");
	}
	
	@Test // 5
	public void testCase2() {
		System.out.println("Test >> testcase2 - do something else");
	}
	
	@Test // 5
	public void testCase3() {
		System.out.println("Test >> testcase3 - logo test");
	}

	// Post conditions -- starting with @After
	@AfterMethod // 6
	public void logOut() {
		System.out.println("AfterMethod- Logout from app");
	}

	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("AfterClass- Close Browser");
	}

	@AfterTest // 8
	public void deleteAllCookies() {
		System.out.println("AfterTest- deleteAllCookies");
	}

//	@AfterSuite
//	public void generateTestReport() {
//		System.out.println("AfterSuite- generateTestReport");
//	}
}
