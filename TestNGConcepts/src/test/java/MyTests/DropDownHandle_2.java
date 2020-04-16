package MyTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownHandle_2 {

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

		Select select = new Select(day);
		select.selectByIndex(3);

		System.out.println(select.isMultiple());

		// get options method for drop down

		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());

		// list day values
		int TotalDays = listDays.size() - 1;
		System.out.println("Total days are: " + TotalDays);

		for (int i = 0; i < listDays.size(); i++) {
			String dayVal = listDays.get(i).getText();
			System.out.println(dayVal);
			if(dayVal == "20") {
				
			}
		}

		// list month value

		Select select1 = new Select(month);

		List<WebElement> listMonths = select1.getOptions();
		System.out.println(listMonths.size());

		for (int j = 0; j < listMonths.size(); j++) {
			String MonthVal = listMonths.get(j).getText();
			System.out.println(MonthVal);
			
			if (MonthVal.equals("Jun")) {
				listMonths.get(j).click();
				break;
			}
		}

		// list year value
		Select select2 = new Select(year);

		List<WebElement> listYears = select2.getOptions();
		System.out.println(listYears.size());

		for (int k = 0; k < listYears.size(); k++) {
			String YearVal = listYears.get(k).getText();
			System.out.println(YearVal);
		}

	}

}
