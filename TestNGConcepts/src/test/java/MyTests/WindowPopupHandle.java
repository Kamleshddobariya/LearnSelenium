package MyTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPopupHandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();
		String parentWindowID = it.next();
		System.out.println("parent window id: " + parentWindowID);

		String childWindowID = it.next();
		System.out.println("Child window id: " + childWindowID);

		driver.switchTo().window(childWindowID);
		System.out.println("child window popup title: " + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowID);
		System.out.println("parent window popup title: " + driver.getTitle());
		
		

	}

}
