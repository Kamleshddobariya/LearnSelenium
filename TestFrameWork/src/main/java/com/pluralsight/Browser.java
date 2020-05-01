package com.pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void goTo(String url) {
		driver.get(url);
	}

	public static String title() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
		
	}

}
