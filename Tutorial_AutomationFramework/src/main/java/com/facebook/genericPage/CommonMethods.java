package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage
{

	public CommonMethods() throws Exception {
		super();

	}
	
//	Get Text to Web Element
	public void getWebElementText(String xpathkey)
	{
		String gettextofWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(gettextofWebElement);
	}
	
//	Click method
	public void clickWebElement(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}
	
//	Clear method
	public void clearData(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}

//	Enter data
	public void enterData(String xpathkey,String testdata)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}
	
//	Mouse Hover
	public void moveToElement(String xpathkey)
	{
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();	
	}
	
//	Click List of Web Element
	public void clickListElement(String xpathkey,String testdata)
	{
		List<WebElement> listofElements = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		
		for(int i=0; i<listofElements.size(); i++)
		{
			if(listofElements.get(i).getText().equalsIgnoreCase(td.getProperty(testdata)))
			{
				listofElements.get(i).click();
			}
		}
	}
	
//	Select dropdown value using visible Text
	public void selectDropdownValue(String xpathkey, String testdata)
	{
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select Webele=new Select(ele);
		Webele.selectByVisibleText(td.getProperty(testdata));
	}
	
//	Read Excel Data
	public void readExcelData(String xpathkey, int rowNo,int colNo,String excelsheetName) throws Exception
	{
		File src =new File(".\\src\\com.facebook.resources\\Excel Name.xlsx");
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(prop.getProperty(excelsheetName));
		System.out.println(sh.getSheetName());
		String abc = sh.getRow(rowNo).getCell(colNo).getStringCellValue();
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(abc);
  		
	}
	
//	Handling Explicit wait - visiblityofElementLocated
	public void handleExplicitWait_visiblityofElementLocated(String xpathkey,String testdata)
	{
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(xpathkey)))).sendKeys(td.getProperty(testdata));
	}
	
//	Handling Explicit wait - elementToBeClickable
	public void handleExplicitWait_elementToBeClickable(String xpathkey)
	{
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(or.getProperty(xpathkey)))).click();
	}
	
//	Handle Log File
	public void handleLogger(String logClassName,String loggerText)
	{
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(prop.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}
	
//	Capture Screenshot
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
//			Create ref of TakesScreenshot Interface and type casting 
			TakesScreenshot ts = (TakesScreenshot) driver; // Typecasting of 2 interfaces
			
//			Use getScreenshotAs() to capture the screenshot in File format
//			getScreenshotAs() method return type = FILE
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
//			Copy file to Specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, Screenshot captured");
			
		}

	}

}
