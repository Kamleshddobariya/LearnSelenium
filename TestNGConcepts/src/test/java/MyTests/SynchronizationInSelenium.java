package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// above is dynamic wait >> If page is fully loaded in 2 seconds then it moves
		// ahead
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// implicitly wait >> always applied globally -- is available for all the web
		// elements available on the page
		// It can be changed anywhere and an any time

		// Do not use explicitly wait and implicitly wait together

		driver.get("http://www.facebook.com");

		WebElement firstname = driver.findElement(By.id("u_0_m"));
		WebElement lastname = driver.findElement(By.id("u_0_o"));
		WebElement mobnumber = driver.findElement(By.id("u_0_r"));
		WebElement pswd = driver.findElement(By.id("u_0_w"));

		WebElement forgotaccount = driver.findElement(By.linkText("Forgotten account?"));

		sendKeys(driver, firstname, 10, "Ramesh");
		sendKeys(driver, lastname, 5, "Patel");
		sendKeys(driver, mobnumber, 8, "9999999999");
		sendKeys(driver, pswd, 15, "123456");

		clickOn(driver, forgotaccount, 10);

		// override implicitly wait at any time
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	// explicitly wait method:
	// 1. no explicit keyword or method
	// 2. available with WebDriverWait with some ExpectedCondition
	// 3. specific to element
	// 4. Dynamic in nature
	// 5. we should never use implicit wait and explicit wait together >> Because
	// selenium WD will wait for the first for implicit wait & then explicit wait
	// applied so total wait will be increased unnecessary
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	// explicitly wait method
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
