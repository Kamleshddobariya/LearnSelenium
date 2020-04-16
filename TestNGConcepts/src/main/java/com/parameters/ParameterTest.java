package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test	
	@Parameters({ "env", "browser", "url", "emailid", "pswd" }) // to define parameter from testng xml file
	
	/*
     * If "testParameters1" not found in testng xml use value provided for parameter "optionalParames".
     * If none is present in testng xml, use null. 
     */
	
	public void yahooLogin(@Optional("QA") String env,@Optional("chrome") String browser, @Optional("https://login.yahoo.com/?.intl=in") String url, @Optional("kamleshddobariya@yahoo.com") String emailid, @Optional("@Kam2093") String pswd) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if (env.equals("QA")) {
		driver.get(url);
		}

		driver.findElement(By.id("login-username")).sendKeys(emailid);
		driver.findElement(By.id("login-username")).sendKeys(Keys.ENTER);
		// driver.findElement(By.id("login-signin")).click();

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
		driver.findElement(By.id("login-passwd")).sendKeys(pswd);
		driver.findElement(By.id("login-passwd")).sendKeys(Keys.ENTER);

		// driver.findElement(By.id("login-signin")).click();

		driver.findElement(By.xpath("//*[@id=\"header-mail-button\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div/div[4]/div[1]/div/label/div/img")).click();

		String s = driver.findElement(By.linkText("Sign out")).getText();
		System.out.println(s);

		WebElement signOut = driver.findElement(By.linkText("Sign out"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", signOut);

	}

}

