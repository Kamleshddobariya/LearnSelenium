package com.usm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usm.qa.base.TestBase;

public class NewStonePage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	public WebElement NewStoneButton;
	
	@FindBy(id = "owner")
	public WebElement ownername;
	
	@FindBy(id = "stock-id")
	public WebElement stockID;
	
	@FindBy(id = "carat")
	public WebElement carat;
	
	@FindBy(id = "Shape")
	public WebElement shape;
	
	@FindBy(id = "lot-id")
	public WebElement lotID;
	
	@FindBy(id = "comment")
	public WebElement comment;
	
	@FindBy(id = "program")
	public WebElement selectProgram;
	
	@FindBy(id = "stone-lab")
	public WebElement labname;
	
	@FindBy(id = "cert")
	public WebElement certID;
	
	@FindBy(id = "cut")
	public WebElement cut;
	
	@FindBy(id = "color")
	public WebElement color;

	@FindBy(id = "vs1-color")
	public WebElement clarity;
	
	@FindBy(id = "polish")
	public WebElement polish;
	
	@FindBy(id = "Symmetry")
	public WebElement symmetry;
	
	@FindBy(id = "flour")
	public WebElement fluorescence;
	
	@FindBy(xpath = "//input[@name=\\'width\\']")
	public WebElement dimensionWidth;
	
	@FindBy(xpath = "//input[@name=\\'height\\']")
	public WebElement dimensionLength;
	
	@FindBy(xpath = "//input[@name=\\'depth\\']")
	public WebElement dimensionDepth;
	
	@FindBy(xpath = "//button[@class=\'btn btn-primary ng-scope\']")
	public WebElement Save;
	
	@FindBy(xpath = "//span[@class='alert-text']")
	public WebElement verifySave;
	
//	@FindBy(id = "program")
//	public WebElement SelectProgram;
	
	
//==============================================================================//
	
	//current class object - initialize Elements with the help of Page Factory 
	public NewStonePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Different Actions for the page:
	//1. Click on NewStone Button
	public void clickonNewStoneButtonLink() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", NewStoneButton);
	}
	
	//2. Create New Stone
	public String createNewStone(String Ownername, String StockID, String Carat, String Shape,  String LotID, String Comment, String Program, String Labname, String Cert, String Cut, String Color, String Clarity, String Polish, String Symmetry, String Fluorescence, String Fluorescencecolor, String DimensionWidth, String DimensionLength, String DimensionDepth, String Result) throws InterruptedException {
				
		Select ownerdropdown = new Select(driver.findElement(By.id("owner")));
		ownerdropdown.selectByVisibleText(Ownername);
		
		stockID.sendKeys(StockID);
		carat.sendKeys(Carat);
		
		Select shapedropdown = new Select(driver.findElement(By.id("Shape")));
		shapedropdown.selectByVisibleText(Shape);
		
		lotID.sendKeys(LotID);
		comment.sendKeys(Comment);
		
		 {
			 WebDriverWait wait = new WebDriverWait(driver, 20);
			 WebElement programdropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("program")));
			 programdropdown.click();
			 programdropdown.sendKeys(Program);
			 System.out.println(Program);
			 //Thread.sleep(3000);
			 programdropdown.click();
			 //programdropdown.sendKeys(Keys.ENTER);			
		 }
		
		Select stonelabdropdown = new Select(driver.findElement(By.id("stone-lab")));
		//System.out.println(Labname);
		stonelabdropdown.selectByVisibleText(Labname);
				
		String MyLab = "Sarine";
	    String MyLab1 = "Self";
	    
	    if (Labname.equalsIgnoreCase(MyLab) || Labname.equalsIgnoreCase(MyLab1)) {
	    
	    Select cutdropdown = new Select(driver.findElement(By.id("cut")));
	    cutdropdown.selectByVisibleText(Cut);
	    
	    Select colordropdown = new Select(driver.findElement(By.id("color")));
	    colordropdown.selectByVisibleText(Color);
	    
	    Select claritydropdown = new Select(driver.findElement(By.id("vs1-color")));
	    claritydropdown.selectByVisibleText(Clarity);
	    
	    Select polishdropdown = new Select(driver.findElement(By.id("polish")));
	    polishdropdown.selectByVisibleText(Polish);
	    
	    Select Symmetrydropdown = new Select(driver.findElement(By.id("Symmetry")));
	    Symmetrydropdown.selectByVisibleText(Symmetry);
	    
	    Select flourdropdown = new Select(driver.findElement(By.id("flour")));
	    flourdropdown.selectByVisibleText(Fluorescence);
	    
	    Select flcolordropdown = new Select(driver.findElement(By.id("fluor-color")));
	    flcolordropdown.selectByVisibleText(Fluorescencecolor);
	    
	    driver.findElement(By.xpath("//input[@name=\'width\']")).sendKeys(DimensionWidth);
	    driver.findElement(By.xpath("//input[@name=\'height\']")).sendKeys(DimensionLength);
	    driver.findElement(By.xpath("//input[@name=\'depth\']")).sendKeys(DimensionDepth);
	    }
	    
	    else {
	    
	    driver.findElement(By.id("cert")).sendKeys(Cert);
	    	
	    Select cutdropdown = new Select(driver.findElement(By.id("cut")));
	    cutdropdown.selectByVisibleText(Cut);
	    
		Select colordropdown = new Select(driver.findElement(By.id("color")));
	    colordropdown.selectByVisibleText(Color);
		    
	    Select claritydropdown = new Select(driver.findElement(By.id("vs1-color")));
	    claritydropdown.selectByVisibleText(Clarity);
		    
		Select polishdropdown = new Select(driver.findElement(By.id("polish")));
		polishdropdown.selectByVisibleText(Polish);
		    
		Select Symmetrydropdown = new Select(driver.findElement(By.id("Symmetry")));
		Symmetrydropdown.selectByVisibleText(Symmetry);
		    
		Select flourdropdown = new Select(driver.findElement(By.id("flour")));
		flourdropdown.selectByVisibleText(Fluorescence);
		    
		Select flcolordropdown = new Select(driver.findElement(By.id("fluor-color")));
		flcolordropdown.selectByVisibleText(Fluorescencecolor);
		    
		driver.findElement(By.xpath("//input[@name=\'width\']")).sendKeys(DimensionWidth);
		driver.findElement(By.xpath("//input[@name=\'height\']")).sendKeys(DimensionLength);
		driver.findElement(By.xpath("//input[@name=\'depth\']")).sendKeys(DimensionDepth);
		    
	    }
	    
		Save.click();
		
		Thread.sleep(3000);
		Result = driver.findElement(By.xpath("//span[@class='alert-text']")).getText();
		System.out.println(Result);
		return Result;
		
	}
	
	public void verifyStonesave() {
		String successMsg = verifySave.getText();
		System.out.println(successMsg);
	}
}
