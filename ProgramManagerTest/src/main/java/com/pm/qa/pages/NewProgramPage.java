package com.pm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pm.qa.base.TestBase;

public class NewProgramPage extends TestBase {
	
	// Page Factory - Object Repository
	@FindBy(id = "programName")
	public WebElement programName;

	@FindBy(xpath = "//h4[contains(text(),'Bundle List')]//a[@class='btn btn-primary pull-right']")
	public WebElement createNewBundle;

	@FindBy(id = "bundleName")
	public WebElement bundleName;

	@FindBy(xpath = "//h4[contains(text(),'Template List')]//a[@class='btn btn-primary pull-right']")
	public WebElement createTemplateList;

	@FindBy(xpath = "//select[@class='ng-pristine ng-invalid ng-invalid-required ng-touched']")
	public WebElement selectTemplateType;

	@FindBy(id = "templateName")
	public WebElement templateName;
	
	@FindBy(xpath = "//a[contains(text(),'AutoTest_DD')]")
	public WebElement selectTemplateName;
	
	@FindBy(xpath = "//form[@id='templateForm']//button[@class='btn btn-primary'][contains(text(),'Apply')]")
	public WebElement templateApply;
	
	@FindBy(xpath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement bundleActive;
	
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	public WebElement applyBundle;
	
	@FindBy(xpath = "//h4[contains(text(),'Member Account List')]//span[contains(@class,'glyphicon glyphicon-plus')]")
	public WebElement createMemberAccountList;
	
	@FindBy(xpath = "//span[contains(@class,'glyphicon glyphicon-user')]")
	public WebElement selectAccount;
	
	@FindBy(xpath = "//input[contains(@class,'form-control ng-pristine ng-valid ng-touched')]")
	public WebElement searchAccountName;
	
	@FindBy(xpath = "//span[contains(text(),'India_Profile_QA2M')]")
	public WebElement chooseAccount;
	
	@FindBy(xpath = "//select[@class='ng-pristine ng-valid ng-touched']")
	public WebElement selectPrintShopPR;
	
	@FindBy(xpath = "//div[@class='left-col']//span[@class='glyphicon glyphicon-pencil']")
	public WebElement selectShippingAddressPR;
	
	@FindBy(xpath = "//div[contains(@class,'ngCellText ng-scope col0 colt0')]")
	public WebElement chooseShippingAddressPR;
	
	@FindBy(xpath = "//form[@id='shippingAddressSelectionForm']//button[@class='btn btn-primary'][contains(text(),'Apply')]")
	public WebElement applyShippingAddressPR;
	
	@FindBy(xpath = "//div[contains(@class,'right-col')]//div[contains(@class,'panel-body')]//div//select[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement selectPrintShop3D;
	
	@FindBy(xpath = "//div[contains(@class,'right-col')]//div[contains(@class,'right-col')]//a[contains(@class,'btn btn-primary pull-right')]")
	public WebElement selectShippingAddress3D;
	
	@FindBy(xpath = "//div[contains(@class,'ngCellText ng-scope col0 colt0')]")
	public WebElement chooseShippingAddress3D;
	
	@FindBy(xpath = "//form[@id='shippingAddressSelectionForm']//button[contains(@class,'btn btn-primary')][contains(text(),'Apply')]")
	public WebElement applyShippingAddress3D;
	
	@FindBy(xpath = "//div[contains(@class,'panel-body')]//div//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement checkProgramLeadRole;
	
	@FindBy(xpath = "//div[contains(@class,'right-col')]//div[contains(@class,'panel')]//div[contains(@class,'panel-body')]//div//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement checkProgramMeasureQCActivity;
	
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	public WebElement memberAccountApply;
	
	@FindBy(xpath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement checkMeasuringSchemeLight;
	
	@FindBy(xpath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement programActive;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement programSave;
	
	@FindBy(xpath = "//div[@class='notifyjs-corner']")
	public WebElement verifyProgramSaved;
	
	
	
	
	
	// =============================================================================//

	// current class object - initialize Elements with the help of Page Factory
	public NewProgramPage() {
			PageFactory.initElements(driver, this);
		}

	// Different Actions for the page:
	// 1. create New Bundle for New Program
	public void createNewBundle() {
		
		
	}
}
