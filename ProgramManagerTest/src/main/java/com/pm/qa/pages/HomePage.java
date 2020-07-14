package com.pm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(linkText = "Sign out")
	public WebElement logOut;

	@FindBy(xpath = "//li[@class='ng-binding']")
	public WebElement loginConfirmationLabel;

	@FindBy(xpath = "//li[contains(text(),'Welcome Dlight SARINE')]")
	public WebElement loginConfirmationDisplayUserName;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement searchBox;

	@FindBy(xpath = "//td[4]")
	public WebElement searchProgramNameValue;

	@FindBy(className = "ng-binding")
	public WebElement searchProgramNameValue1;

	@FindBy(xpath = "//span[contains(text(),'New')]")
	public WebElement createNewProgram;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-pencil']")
	public WebElement editProgram;

	@FindBy(xpath = "//label[contains(text(),'Active')]//input")
	public WebElement programActive;

	@FindBy(id = "programLocation")
	public WebElement programLocation;

	@FindBy(xpath = "//form[@id='scopeForm']//div//div//button[contains(text(),'Save')]")
	public WebElement scopeSave;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-list']")
	public WebElement editProgramScope;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement programSave;

	@FindBy(xpath = "//span[contains(@class,'glyphicon glyphicon-remove')]")
	public WebElement deleteProgram;

	@FindBy(xpath = "//button[contains(@class,'btn-primary')]")
	public WebElement deleteOKProgram;

	// =============================================================================//

	// current class object - initialize Elements with the help of Page Factory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Different Actions for the page:
	// 1. verify page title after login
	public String validateAfterLoginPageTitle() {
		return driver.getTitle();
	}

	// 2. verify login userName Label
	public String validateLoginConfirmation() {
		WebDriverWait loginConfirmationValue = new WebDriverWait(driver, 60);
		loginConfirmationValue.until(ExpectedConditions.visibilityOf(loginConfirmationLabel));
		return loginConfirmationLabel.getText();

	}

	// 2A. verify login userName Label
	public String validateLoginConfirmationByUserName() {
		WebDriverWait loginConfirmationValue = new WebDriverWait(driver, 60);
		loginConfirmationValue.until(ExpectedConditions.visibilityOf(loginConfirmationDisplayUserName));
		return loginConfirmationDisplayUserName.getText();

	}

	// 3. click in search box
	public void clickInSearchBox() {
		clickOn(driver, searchBox, 15);

	}

	// 4. enter program name in search box
	public void enterSearchProgram(String myProgramName) {

		// sendKeys(driver, searchBox, 15, "IAMChanges");
		sendKeys(driver, searchBox, 15, myProgramName);

	}

	// 5. verify searched program name
	public String verifySearchSucessfully() throws Exception {

		Thread.sleep(5000);
		return searchProgramNameValue.getText();

	}

	// 6. click on Edit Program
	public void clickOnEditProgram() throws Exception {
		Thread.sleep(5000);

		clickOn(driver, editProgram, 30);
		Thread.sleep(5000);

	}

	// 7. click on Deactivate program
	public void clickOnProgramDeactive() throws Exception {
		// Thread.sleep(10000);
		// clickOn(driver, programActive, 30);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		WebElement activeProgramCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > label")));

		activeProgramCheckbox.click();

	}

	// 8. edit program scope
	public void clickOnEditProgramScope() throws Exception {

		Thread.sleep(6000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement activeProgramCheckbox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit Program')]")));

		clickOn(driver, editProgramScope, 30);
		// driver.findElement(By.cssSelector(".glyphicon-list")).click();

	}

	// 9. click on Program Location
	public void clickOnProgramLocation() {
		// driver.findElement(By.id("programLocation")).click();
		clickOn(driver, programLocation, 15);
	}

	// 10. choose Program Location
	public void chooseProgramLocation() {

		String China_xpath = "//option[. = 'China']";

		selectDropDownValue(China_xpath, "China");
	}

	// 11. save Scope
	public void clickOnSaveScope() {
		clickOn(driver, scopeSave, 15);

	}

	// 12. verify Program Location Value
	public String verifyProgramLocation() throws Exception {

		Thread.sleep(3000);

		String selectedOption = new Select(driver.findElement(By.xpath("//select[@id='programLocation']")))
				.getFirstSelectedOption().getText();
		return selectedOption;

	}

	// 13. click on Program active
	public void clickOnProgramActive() throws Exception {
		// Thread.sleep(10000);
		// clickOn(driver, programActive, 30);
		// span[contains(text(),'Edit Program')]

		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement activeProgramCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > label")));

		activeProgramCheckbox.click();
		// clickOn(driver, programActive, 60);

		// driver.findElement(By.cssSelector(".form-group:nth-child(1) >
		// label")).click();

	}

	// 14. save program
	public void saveProgram() throws Exception {
		Thread.sleep(3000);
		clickOn(driver, programSave, 15);
	}

	public boolean verifyActiveProgram() {

		return driver.findElement(By.cssSelector(".panel-body > .checkbox > label > .ng-pristine")).isEnabled();
		// return programActive.isSelected();

	}

	// clear search
	public void clearSearch() throws Exception {

		Thread.sleep(3000);
		searchBox.clear();

	}

	// 15. delete program
	public void deleteProgram() throws Exception {
		Thread.sleep(3000);
		clickOn(driver, deleteProgram, 15);
		clickOn(driver, deleteOKProgram, 15);
	}

	// 16. verify delete program
	public String verifyDeleteProgramSuccessfully() throws Exception {

		Thread.sleep(1500);
		WebElement confirmation = driver
				.findElement(By.xpath("//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']"));
		return confirmation.getText();
	}

	// ****************************************************************************************//

	// explicitly wait method for sendKeys:
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}

	// explicitly wait method for click action:
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	// to handle drop down list values
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
