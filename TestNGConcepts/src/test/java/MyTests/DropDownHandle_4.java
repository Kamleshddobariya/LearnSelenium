package MyTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownHandle_4 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		String day_xpath = "//select[@id='day']//option";
		String month_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";

		selectDropDownValue(day_xpath, "29");
		selectDropDownValue(month_xpath, "Jun");
		selectDropDownValue(year_xpath, "1987");

	}

	public static void selectDropDownValue(String xpathValue, String value) {

		List<WebElement> dropdownlist = driver.findElements(By.xpath(xpathValue));
		System.out.println(dropdownlist.size());

		for (int j = 0; j < dropdownlist.size(); j++) {
			String dropDownVal = dropdownlist.get(j).getText();
			System.out.println(dropDownVal);

			if (dropDownVal.equals(value)) {
				dropdownlist.get(j).click();
				break;
			}
		}
	}

}
