package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopupHandle_1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://html.com/input-type-file/");

//		driver.switchTo().frame(0);
//		driver.switchTo().
//		driver.findElement(By.xpath("//*[@id=\"pushmonkey-prompt-container\"]/div/div[2]/a[1]")).click();

		driver.findElement(By.id("fileupload")).sendKeys("E:\\eclipse-workspace\\example-html.html");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value = 'submit']")).click();
	}

}
