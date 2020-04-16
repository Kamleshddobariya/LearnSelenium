package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://login.yahoo.com/?.intl=in");

		// 1. By id: Preference =1
//		driver.findElement(By.id("login-username")).sendKeys("kamleshddobariya@yahoo.com");
//		driver.findElement(By.id("login-signin")).click();
//		driver.findElement(By.id("createacc")).click();

		// 2. By name:Preference =1
//		driver.findElement(By.name("username")).sendKeys("kamleshddobariya@yahoo.com");
//		driver.findElement(By.name("signin")).click();

		// 3. By xpath:Preference =2
//		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kamleshddobariya@yahoo.com");
//		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
//		driver.findElement(By.xpath("//*[@id=\"createacc\"]")).click();

		// 4. By cssSelector: Preference =3
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("kamleshddobariya@yahoo.com");
//		driver.findElement(By.cssSelector("#login-signin")).click();

		// 5. By LinkText: Only for links
//		driver.findElement(By.linkText("Forgotten username?")).click();
//		driver.findElement(By.linkText("Create an account")).click();

		// 6. By Partial linkText
//		driver.findElement(By.partialLinkText("Create an account")).click();

		// 7. By Class name >> It can be same for different elements >> so not good to use it.
		driver.findElement(By.className("phone-no")).sendKeys("8888888888");
//		driver.findElement(By.className("orko-button-primary orko-button challenge-button")).click();
//		driver.findElement(By.className("orko-button-secondary orko-button challenge-button")).click();
	}

}
