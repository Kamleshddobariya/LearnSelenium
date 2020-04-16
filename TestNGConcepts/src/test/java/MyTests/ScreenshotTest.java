package MyTests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {

	static WebDriver driver;

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

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void takeScreenshotTest() throws IOException {
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Google", "title is not matched");

		String nameofCurrMethod = new Object() {
		}

				.getClass().getEnclosingMethod().getName();

		takeScreenshotAtEndOfTest(nameofCurrMethod);
	}

	public static void takeScreenshotAtEndOfTest(String nameofCurrMethod) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile,
				new File(currentDir + "/screenshots/" + nameofCurrMethod + System.currentTimeMillis() + ".png"));
	}

}
