package com.usm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usm.qa.base.TestBase;

public class StonesGrid  extends TestBase {

	@FindBy(xpath = "//clr-spinner[@class='spinner spinner-md']")
	public WebElement LoadSpinner;
	
	@FindBy(xpath = "//label[@class='clr-control-label ng-star-inserted']")
	public WebElement SelectAllForCurrentPage;
	
	@FindBy(xpath = "//clr-icon[@shape='ellipsis-vertical']")
	public WebElement ThreeDotMenu;
	
	@FindBy(xpath = "//clr-icon[@class='datagrid-expandable-caret-icon']")
	public WebElement QuickStoneView;
	
//==============================================================================//
	
	//current class object - initialize Elements with the help of Page Factory 
	public StonesGrid(){
		PageFactory.initElements(driver, this);
	}
		
	//Different Actions for the page:
	//1. verify SelectAllPage Check-box
	public boolean validateSelectAllPageCheckbox() {
		return SelectAllForCurrentPage.isSelected();
	}
	
	//2. click SelectAllPage Check-box
	public boolean ClickSelectAllPageCheckbox() {
		//SelectAllForCurrentPage.click();
		{
			 WebDriverWait wait = new WebDriverWait(driver, 30);
			 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//clr-spinner[@class='spinner spinner-md']")));
			 SelectAllForCurrentPage.click();
			 return SelectAllForCurrentPage.isEnabled();
		}
	}
	
	
}
