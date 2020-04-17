package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressEven {

	@Test
	public void keyEventTest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		//option 1:
		driver.findElement(By.id("target")).click();
		driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: SPACE");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.UP).build().perform();
//		driver.findElement(By.id("target")).click();
//		driver.findElement(By.id("target")).sendKeys(Keys.UP);
		String text1 = driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "You entered: UP");
	}

}
