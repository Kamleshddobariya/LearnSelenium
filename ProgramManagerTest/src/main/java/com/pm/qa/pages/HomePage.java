package com.pm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(linkText = "Sign out")
	public WebElement logOut;
	
	@FindBy(xpath = "//li[@class='ng-binding']")
	public WebElement loginConfirmationLabel;
	
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	public WebElement searchBox;

	@FindBy(xpath = "//td[contains(text(),'RnD_OM_E2E_Kamlesh')]")
	public WebElement searchProgramNameValue;
	
	@FindBy(xpath = "//span[contains(text(),'New')]")
	public WebElement createNewProgram;
	
	@FindBy(xpath = "//div[@class='notifyjs-corner']")
	public WebElement deleteProgram;
	
	@FindBy(xpath = "//div[@class='notifyjs-corner']")
	public WebElement editProgram;	

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

}
