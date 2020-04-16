package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

//		Select select1 = new Select(day);
//		select1.selectByVisibleText("20");
//		
//		Select select2 = new Select(month);
//		select2.selectByVisibleText("May");
//		
//		Select select3 = new Select(year);
//		select3.selectByVisibleText("1995");

		String dob = "10-May-1990";
		String dobArr[] = dob.split("-");

		selectValueFromDropDown(day, dobArr[0]);
		selectValueFromDropDown(month, dobArr[1]);
		selectValueFromDropDown(year, dobArr[2]);

//		selectValueFromDropDown(day,"20");
//		selectValueFromDropDown(month,"May");
//		selectValueFromDropDown(year,"1993");

	}

	public static void selectValueFromDropDown(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}
