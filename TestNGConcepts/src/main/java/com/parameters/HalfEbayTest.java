package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {

	WebDriver driver;
	String sheetName = "TestData";

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://reg.ebay.com/reg/PartialReg");
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data [][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getTestData")
	public void HalfEbayRegPageTest(String firstname, String lastname, String emailaddress, String password) {

		//elements
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastname);
				
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailaddress);
				
		driver.findElement(By.id("PASSWORD")).clear();
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ppaFormSbtBtn")));
		driver.findElement(By.id("ppaFormSbtBtn")).click();;
	}

	@AfterMethod()
	public void tearDown() {
		//driver.quit();
	}

}
