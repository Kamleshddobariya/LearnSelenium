package com.pm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pm.qa.base.TestBase;

public class HomePage_1 extends TestBase {

	// Page Factory - Object Repository
	@FindBy(linkText = "Sign out")
	public WebElement logOut;

	@FindBy(xpath = "//li[@class='ng-binding']")
	public WebElement loginConfirmationLabel;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement searchBox;

	@FindBy(xpath = "//td[4]")
	public WebElement searchProgramNameValue;

	@FindBy(className = "ng-binding")
	public WebElement searchProgramNameValue1;

	@FindBy(xpath = "//span[contains(text(),'New')]")
	public WebElement createNewProgram;

	@FindBy(xpath = "//span[contains(@class,'glyphicon glyphicon-pencil')]")
	public WebElement editProgram;

	@FindBy(xpath = "//label[contains(text(),'Active')]//input")
	public WebElement programActive;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement programSave;

	@FindBy(xpath = "//span[contains(@class,'glyphicon glyphicon-remove')]")
	public WebElement deleteProgram;

	@FindBy(xpath = "//button[contains(@class,'btn-primary')]")
	public WebElement deleteOKProgram;

	// =============================================================================//

	// current class object - initialize Elements with the help of Page Factory
	public HomePage_1() {
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

	// 3. click in search box
	public void clickInSearchBox() {
		clickOn(driver, searchBox, 15);

	}

	// 4. enter program name in search box
//	public void enterSearchProgram(String myProgramName)
	public void enterSearchProgram() throws Exception {

		sendKeys(driver, searchBox, 15, "AutoTest4");
		// sendKeys(driver, searchBox, 15, myProgramName);

	}

	// 5. verify searched program name
	public String verifySearchSucessfully() {

		return searchProgramNameValue.getText();

	}

	// 6. click on Edit Program
	public void clickOnEditProgram() throws Exception {
		Thread.sleep(3000);
		clickOn(driver, editProgram, 15);

	}

	// 7. click on Deactivate program
	public void clickOnProgramDeactive() throws Exception {
		Thread.sleep(5000);
		clickOn(driver, programActive, 15);

	}

	// . save program
	public void saveProgram() throws Exception {
		Thread.sleep(3000);
		clickOn(driver, programSave, 15);
	}

	// . delete program
	public void deleteProgram() {
		clickOn(driver, deleteProgram, 15);
		clickOn(driver, deleteOKProgram, 15);
	}

	// . delete program
	public String verifyDeleteProgramSuccessfully() throws Exception {

		Thread.sleep(1000);
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

}
