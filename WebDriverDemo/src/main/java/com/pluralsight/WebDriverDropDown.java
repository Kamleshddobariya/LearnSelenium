package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("E:\\eclipse-workspace\\WebDriverDemo\\sar\\main\\webapp\\DropDownTest.html");

		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");

	}

}
