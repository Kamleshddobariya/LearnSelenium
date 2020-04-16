package MyTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownHandle_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");
		
		List<WebElement> monthlist = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(monthlist.size());
		
		for (int j = 0; j < monthlist.size(); j++) {
			String MonthVal = monthlist.get(j).getText();
			System.out.println(MonthVal);
			
			if (MonthVal.equals("Jun")) {
				monthlist.get(j).click();
				break;
			}
		}
		
	}

}
