package com.usm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usm.qa.base.TestBase;

public class StonesPage extends TestBase {

	@FindBy(xpath = "//button[@class='btn btn-sm btn-outline align-right m-0']")
	public WebElement ClearButton;
	
	@FindBy(xpath = "//div[@class='btn-link text-center']")
	public WebElement AdvancedFilters;
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	public WebElement NewStoneButton;
	
	@FindBy(xpath = "//button[@class='btn btn-outline btn-sm'][2]")
	public WebElement OrderButton;
	
	@FindBy(xpath = "//button[@class='btn btn-outline btn-sm'][3]")
	public WebElement ExportButton;
	

//==============================================================================//
	
	//current class object - initialize Elements with the help of Page Factory 
	public StonesPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Different Actions for the page:
	//1. verify Advanced filter Link
	public boolean validateAdvancedFiltersLink() {
		return AdvancedFilters.isDisplayed();
	}
	
	//2. verify NewButton Link
	public boolean validateNewButtonLink() {
		return NewStoneButton.isEnabled();
	}
	
	//3. verify NewButton Link
	public boolean validateOrderButtonLink() {
		return OrderButton.isEnabled();
	}
	
	//4. verify ExportButton Link
	public boolean validateExportButtonLink() {
		return ExportButton.isEnabled();
	}
	
	//5. verify ClearButton
	public boolean validateClearButton() {
		return ClearButton.isEnabled();
	}
	
	
	
}
