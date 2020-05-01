package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\User\\git\\repository\\WebDriverDemo\\sar\\main\\webapp\\TableTest.html");

//		WebElement outerTable = driver.findElement(By.tagName("table"));
//		WebElement innerTable = outerTable.findElement(By.tagName("table"));
//		WebElement row = innerTable.findElements(By.tagName("td")).get(1);

		// using xpath
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));
		System.out.println(row.getText());

	}

}
