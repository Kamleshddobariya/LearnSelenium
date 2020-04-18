package MyTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogsLoginTest {

	// logs.. capturing info/activities
	// 1. info
	// 2. warning
	// 3. error
	// 4. fatal

	//use apache log4j
	//where to create: create inside resources folder
	
	WebDriver driver;
	Logger log = Logger.getLogger(LogsLoginTest.class);

	@BeforeMethod
	
	public void setUp() {
//		log4j.info("This is an info message.");
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("launching chrome browser");
		
		driver.get("http://www.freecrm.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		log.warn("warning message");
		log.fatal("fatal error message");
		log.debug("debug message");
	}

	@Test(priority = 1, groups = "Homepage")
	public void freecrmTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		
	}

	@Test(priority = 3, groups = "Homepage")
	public void freecrmLogoTest() {
		boolean b = driver.findElement(By.xpath("//font[contains(text(),'crm')]")).isDisplayed();
		System.out.println(b);
		Assert.assertEquals(true, b);
	}

	private static final Logger log4j = LogManager.getLogger(LogsLoginTest.class
	        .getName());
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
