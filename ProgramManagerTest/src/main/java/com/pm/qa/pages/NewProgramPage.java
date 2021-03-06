package com.pm.qa.pages;

import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pm.qa.base.TestBase;

public class NewProgramPage extends TestBase {

	public String uniqueProgramName, friendlyProgramName;
	public static String myProgramName;

	// Page Factory - Object Repository
	@FindBy(xpath = "//span[contains(text(),'New')]")
	public WebElement createNewProgram;

	@FindBy(id = "programName")
	public WebElement programName;

	@FindBy(xpath = "//h4[contains(text(),'Bundle List')]//a[@class='btn btn-primary pull-right']")
	public WebElement createNewBundle;

	@FindBy(id = "bundleName")
	public WebElement bundleName;

	@FindBy(xpath = "//h4[contains(text(),'Template List')]//a[@class='btn btn-primary pull-right']")
	// @FindBy(css = "\".panel:nth-child(11) .btn\"")
	public WebElement createTemplateList;

	// @FindBy(xpath = "//select[@class='ng-pristine ng-invalid ng-invalid-required
	// ng-touched']")
	@FindBy(xpath = "//select[contains(@placeholder,'Select template type')]")
	public WebElement selectTemplateType;

	@FindBy(id = "templateName")
	public WebElement templateName;

	@FindBy(xpath = "//a[contains(text(),'AutoTest_DD')]")
	public WebElement selectTemplateName;

	@FindBy(xpath = "//form[@id='templateForm']//button[@class='btn btn-primary'][contains(text(),'Apply')]")
	public WebElement templateApply;

	@FindBy(xpath = "//*[@id=\"bundleForm\"]/div[1]/div[2]/div/label/input")
	public WebElement bundleActive;

	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	public WebElement applyBundle;

	@FindBy(xpath = "//h4[contains(text(),'Member Account List')]//span[contains(@class,'glyphicon glyphicon-plus')]")
	public WebElement createMemberAccountList;

	@FindBy(xpath = "//span[contains(@class,'glyphicon glyphicon-user')]")
	public WebElement selectAccount;

	@FindBy(xpath = "//input[contains(@class,'form-control ng-pristine ng-valid ng-touched')]")
	public WebElement searchAccountName;

//	@FindBy(xpath = "//span[contains(text(),'Dlight SARINE')]") // Dlight SARINE OR Kamlesh
//	public WebElement chooseAccount;

	@FindBy(xpath = "//span[contains(text(),'Sarine RND')]") // Dlight SARINE OR Kamlesh OR platformsc
	public WebElement chooseAccount;

	@FindBy(xpath = "//select[contains(@class,'ng-pristine ng-valid ng-touched')]")
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

	@FindBy(xpath = "//input[contains(@class,'ng-valid ng-touched ng-dirty ng-valid-parse')]")
	public WebElement checkProgramLeadRole;

	@FindBy(xpath = "//input[@class='ng-valid ng-dirty ng-valid-parse ng-touched']")
	public WebElement checkProgramMeasureQCActivity;

	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	public WebElement memberAccountApply;

	@FindBy(xpath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement checkMeasuringSchemeLight;

	@FindBy(xpath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public WebElement programActive;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement programSave;

	@FindBy(xpath = "//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']")
	public WebElement verifyProgramSaved;

	// =============================================================================//

	// current class object - initialize Elements with the help of Page Factory
	public NewProgramPage() {
		PageFactory.initElements(driver, this);
	}

	// Different Actions for the page:

	// 1. click on new Program button
	public void clickNewProgram() {
		clickOn(driver, createNewProgram, 15);
		// createNewProgram.click();
	}

	// 2. enter new Program name
	public String enterProgramName() {
//		 sendKeys(driver, programName, 15, prop.getProperty("programName"));

		uniqueProgramName = UUID.randomUUID().toString();
		System.out.println(uniqueProgramName);

		friendlyProgramName = uniqueProgramName.substring(0, 4);
		System.out.println(friendlyProgramName);

		myProgramName = "AutoTest_" + friendlyProgramName;
		sendKeys(driver, programName, 15, myProgramName);
		System.out.println(myProgramName);

		return myProgramName;
	}

	// 3. create New Bundle for New Program
	public void createNewBundle() {
		// createNewBundle.click();
		clickOn(driver, createNewBundle, 15);
	}

	// 4. enter new Bundle name
	public void enterBundleName() {
		sendKeys(driver, bundleName, 15, "AutoTestBundle");

	}

	// 5. create new template list
	public void createNewTemplateList() throws Exception {

		Thread.sleep(5000);
		// clickOn(driver, createTemplateList, 15);
		createTemplateList.click();
	}

	// 6. select template type and template name
	public void selectTemplateTypeDD() throws Exception {

		String DD_xpath = "//option[contains(text(),'Digital Display')]";
		String DR_xpath = "//option[contains(text(),'Digital Report')]";
		String PR_xpath = "//option[contains(text(),'Printed Report')]";
		String Origin3D_xpath = "//option[contains(text(),'Origin 3D')]";

		// *Thread.sleep(4000);
		// *clickOn(driver, selectTemplateType, 15);
		// selectTemplateType.click();
		// *selectDropDownValue(DD_xpath, "Digital Display");
		// *sendKeys(driver, templateName, 15, "AutoTest_DD");
		// templateName.submit();
		// *clickOn(driver, selectTemplateName, 15);
		// selectTemplateName.click();
		// templateApply.click();

		{
			WebElement dropdown = driver.findElement(By.cssSelector("#templateForm > .ng-untouched"));
			dropdown.findElement(By.xpath("//option[. = 'Digital Display']")).click();
		}

//		sendKeys(driver, templateName, 15, "AutoTest_DD");
//		clickOn(driver, selectTemplateName, 30);

		driver.findElement(By.linkText("AutoTest_DD")).click();

	}

	// 7. click on template apply
	public void clickOnTemplateApplyDD() {
		clickOn(driver, templateApply, 15);
	}

	// 6a. select template type and template name
	public void selectTemplateTypeDR() throws Exception {

		String DD_xpath = "//option[contains(text(),'Digital Display')]";
		String DR_xpath = "//option[contains(text(),'Digital Report')]";
		String PR_xpath = "//option[contains(text(),'Printed Report')]";
		String Origin3D_xpath = "//option[contains(text(),'Origin 3D')]";

		// *Thread.sleep(4000);
		// *clickOn(driver, selectTemplateType, 15);
		// selectTemplateType.click();
		// *selectDropDownValue(DD_xpath, "Digital Display");
		// *sendKeys(driver, templateName, 15, "AutoTest_DD");
		// templateName.submit();
		// *clickOn(driver, selectTemplateName, 15);
		// selectTemplateName.click();
		// templateApply.click();

		{
			WebElement dropdown = driver.findElement(By.cssSelector("#templateForm > .ng-untouched"));
			dropdown.findElement(By.xpath("//option[. = 'Digital Report']")).click();
		}

//			sendKeys(driver, templateName, 15, "AutoTest_DD");
//			clickOn(driver, selectTemplateName, 30);

		driver.findElement(By.linkText("AutoTest_DR")).click();

	}

	// 7a. click on template apply
	public void clickOnTemplateApplyDR() {
		clickOn(driver, templateApply, 15);
	}

	// 6b. select template type and template name
	public void selectTemplateTypePR() throws Exception {

		String DD_xpath = "//option[contains(text(),'Digital Display')]";
		String DR_xpath = "//option[contains(text(),'Digital Report')]";
		String PR_xpath = "//option[contains(text(),'Printed Report')]";
		String Origin3D_xpath = "//option[contains(text(),'Origin 3D')]";

		// *Thread.sleep(4000);
		// *clickOn(driver, selectTemplateType, 15);
		// selectTemplateType.click();
		// *selectDropDownValue(DD_xpath, "Digital Display");
		// *sendKeys(driver, templateName, 15, "AutoTest_DD");
		// templateName.submit();
		// *clickOn(driver, selectTemplateName, 15);
		// selectTemplateName.click();
		// templateApply.click();

		{
			WebElement dropdown = driver.findElement(By.cssSelector("#templateForm > .ng-untouched"));
			dropdown.findElement(By.xpath("//option[. = 'Printed Report']")).click();
		}

//				sendKeys(driver, templateName, 15, "AutoTest_DD");
//				clickOn(driver, selectTemplateName, 30);

		driver.findElement(By.linkText("AutoTest_PR")).click();

	}

	// 7b. click on template apply
	public void clickOnTemplateApplyPR() {
		clickOn(driver, templateApply, 15);
	}

	// 8. make bundle active
	public void clickOnBundleActive() throws Exception {
		Thread.sleep(3000);
		clickOn(driver, bundleActive, 15);
	}

	// 9. click on apply to create bundle
	public void clickOnApplyBundle() {
		clickOn(driver, applyBundle, 15);
	}

	// 10. click on create member account list
	public void createNewMemberAccountList() {
		createMemberAccountList.click();
	}

	// 11. select owner from member account list
	public void selectMemberAccount() {
		clickOn(driver, selectAccount, 15);
		// sendKeys(driver, searchAccountName, 15, "India Profile team");
		clickOn(driver, chooseAccount, 15);
	}

	// 12. select PR print shop
	public void selectPRPrintShop() {
		// clickOn(driver, selectPrintShopPR, 15);

		{
			WebElement dropdown = driver.findElement(By.cssSelector(".left-col > .panel-body .ng-pristine"));
			dropdown.findElement(By.xpath("//option[. = 'Sarine']")).click();
		}

	}

	// 13. select Shipping address for PR
	public void chooseShippingAddressPR() {

		clickOn(driver, selectShippingAddressPR, 15);
		clickOn(driver, chooseShippingAddressPR, 15);
		clickOn(driver, applyShippingAddressPR, 15);

	}

	// 14. select account role
	public void selectAccountRole() {
		// clickOn(driver, checkProgramLeadRole, 15);
		driver.findElement(By.cssSelector(".panel-body > div > .ng-scope:nth-child(1) > .ng-pristine")).click();

	}

	// 15. select account activity
	public void selectAccountActivity() {
		// clickOn(driver, checkProgramMeasureQCActivity, 15);
		driver.findElement(By.cssSelector(".right-col .panel-body > div > .ng-scope:nth-child(1) > .ng-pristine"))
				.click();

	}

	// 16. apply memeber account
	public void applyMemberAccount() {
		clickOn(driver, memberAccountApply, 15);
	}

	// 17. select light measuring scheme
	public void selectMeasuringSchemeLight() {
		// clickOn(driver, checkMeasuringSchemeLight, 15);
		driver.findElement(By.cssSelector(".panel-body > .checkbox > label > .ng-pristine")).click();

	}

	// 18. check active program check box
	public void selectProgramActive() {
		// clickOn(driver, programActive, 15);
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > label")).click();
	}

	// 19. save program
	public void saveProgram() {
		clickOn(driver, programSave, 15);
	}

	// 20. verify success message
	public String verifyProgramSaveSuccessfully() throws Exception {

		Thread.sleep(1000);
		WebElement confirmation = driver
				.findElement(By.xpath("//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']"));
		return confirmation.getText();
		// return verifyProgramSaved.getText();

	}

//****************************************************************************************//

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
