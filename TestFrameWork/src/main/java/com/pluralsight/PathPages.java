package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PathPages {

	static String url = "https://www.pluralsight.com/browse";
	static String title = "The Future of the Past: The Coronavirus Pandemic and the New Normal | Pluralsight";

	public void goTo() {
		Browser.setUp();
		Browser.goTo(url);
		
	}

	public void goToCoursePath() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(Browser.driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("The Future of the Past: The Coronavirus Pandemic and the New Normal")));
//		
//		Browser.driver.findElement(By.linkText("Browse library")).click();
		Browser.driver.findElement(By.linkText("The Future of the Past: The Coronavirus Pandemic and the New Normal")).click();
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
	

}
