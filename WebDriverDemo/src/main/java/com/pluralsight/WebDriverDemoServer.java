package com.pluralsight;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverDemoServer {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new RemoteWebDriver((new URL("http://localhost:4444/wd/hub")), DesiredCapabilities.chrome());
		// WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("sarine technologies");
		searchBox.submit();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Images')]")));

		WebElement imagesLink = driver.findElements(By.xpath("//a[contains(text(),'Images')]")).get(0);
		imagesLink.click();

		WebElement imageElement = driver.findElements(By.cssSelector(
				"body.tQj5Y.ghyPEc.IqBfM.ecJEib.EWZcud.eejsDc.uirfo.notranslate.EIlDfe.cjGgHb.d8Etdd.Wq3Ysf.LcUz9d:nth-child(2) div.T1diZc.KWE8qe:nth-child(6) c-wiz.P3Xfjc.SSPGKf.BIdYQ.FA7L0b.zE3eif:nth-child(1) div.mJxzWe:nth-child(3) div.OcgH4b:nth-child(1) div.tmS4cc div.gBPM8 div.islrc div.isv-r.PNCib.MSM1fd.BUooTd:nth-child(1) a.wXeWr.islib.nfEiy.mM5pbd div.bRMDJf.islir > img.rg_i.Q4LuWd.tx8vtf"))
				.get(0);
		// WebElement imageLink = imageElement.findElements(By.className("rg_i Q4LuWd
		// tx8vtf")).get(0);
		imageElement.click();
	}

}
