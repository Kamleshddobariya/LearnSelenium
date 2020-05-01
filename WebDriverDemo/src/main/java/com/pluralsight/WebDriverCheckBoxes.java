package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("E:\\eclipse-workspace\\WebDriverDemo\\sar\\main\\webapp\\CheckBoxTest.html");

		WebElement checkBox = driver.findElement(By.id("greencolor"));
		checkBox.click();

	}

}
