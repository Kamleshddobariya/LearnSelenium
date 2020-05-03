package com.pm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(id = "Email")
	public WebElement userNameField;

	@FindBy(id = "Password")
	public WebElement passwordField;

	@FindBy(id = "loginbutton")
	public WebElement login;

	@FindBy(id = "remember_me")
	public WebElement rememberme;
	
	@FindBy(xpath = "//label[@class='errortext']")
	public WebElement loginFailed;

	@FindBy(xpath = "//div[@id='logo']//a//img")
	public WebElement sarinelogo;

	//======================================================//

	// current class object - initialize Elements with the help of Page Factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Different Actions for the page:
	// 1. verify page title before login
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	// 2. verify image on page
	public boolean validateSarineLogo() {
		return sarinelogo.isDisplayed();
	}

	// 3. login method [Moving to Home Page]
	public HomePage login(String un, String pwd) {
		userNameField.sendKeys(un);
		passwordField.sendKeys(pwd);
		login.click();

		return new HomePage();
	}

	// 4. verify incorrect login message
	public String validateInCorrectLogin() {
		String InCorrectLoginMessage = loginFailed.getText();
		return InCorrectLoginMessage;
	}

}
