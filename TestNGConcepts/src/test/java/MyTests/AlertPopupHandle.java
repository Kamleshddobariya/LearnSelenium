package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopupHandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement SignIn = driver.findElement(By.name("proceed"));
		SignIn.click();

		// Switch to alert class
		Alert alert = driver.switchTo().alert();

		String PopupText = alert.getText();
		System.out.println(PopupText);
		
		Thread.sleep(3000);
		
		alert.accept(); // To click Ok to alert popup
		// alert.dismiss(); //To cancel the alert
		
		if(PopupText.equals("Please enter a valid user name")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}

	}

}
