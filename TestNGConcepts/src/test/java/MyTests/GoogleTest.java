package MyTests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority = 1, groups="Homepage")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 3, groups="Homepage")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println(b);
	}

	@Test(priority = 2, groups="Homepage")
	public void googleEmailLinkTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isDisplayed();
		System.out.println(b);
	}

	@Test(priority = 4 , groups="Extra")
	public void TC1() {
		System.out.println("TC1");
	}

	@Test(priority = 5, groups="Extra")
	public void TC2() {
		System.out.println("TC2");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
