package com.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
		driver.get("https://prod.aceerpsolutions.com/");
		
		driver.findElement(By.name("email")).sendKeys("akn_aessuper");
		
		driver.findElement(By.name("password")).sendKeys("aes");
		
		driver.findElement(By.className("ladda-label")).click();
		
//		driver.findElement(By.xpath("(//span[@class='p-menuitem-text ng-star-inserted'][normalize-space()='Transactions'])[1]")).click();
		
//		Apply this logic if stale expection found:
		for(int i=0;i<5;i++)
		{
			try
			{
				driver.findElement(By.xpath("(//span[@class='p-menuitem-text ng-star-inserted'][normalize-space()='Transactions'])")).click();
			}
			catch(StaleElementReferenceException ex)
			{
//				System.out.println(ex.toString());
				driver.findElement(By.xpath("(//span[@class='p-menuitem-text ng-star-inserted'][normalize-space()='Transactions'])")).click();
			}
		}
		
		
		WebElement trading = driver.findElement(By.xpath("(//a[@class='p-ripple p-element p-menuitem-link ng-star-inserted'])[146]"));
		WebElement fabric = driver.findElement(By.id("menubar_3_7_0_label"));
		WebElement purchase = driver.findElement(By.id("menubar_3_7_0_0_label"));
		WebElement order = driver.findElement(By.xpath("(//a[@class='p-ripple p-element p-menuitem-link ng-star-inserted'])[146]"));
		
//		WebElement inward = driver.findElement(By.xpath("(//a[@role='menuitem'])[149]"));
		
//		For Purchase Order
		Actions action=new Actions(driver);
		action.moveToElement(trading);
		action.moveToElement(fabric);
		action.moveToElement(purchase);
		action.click(order);
//		action.build().perform();
		
		
//		For Purchase Inward
//		Actions action=new Actions(driver);
//		action.moveToElement(trading);
//		action.moveToElement(fabric);
//		action.moveToElement(purchase);
//		action.click(inward);
//		action.build().perform();
		
//		*************************************Fabric Purchase Order******************************************
		
		WebElement ele= driver.findElement(By.xpath("//button[text()=' Add ']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		
	    driver.findElement(By.id("company_ledger")).sendKeys("BALAJI TEXTILE (JOB)");
	    Thread.sleep(3000);
	    
	    for(int i=0;i<10;i++)
	    {
	    	action.sendKeys(Keys.TAB);
	    }
	    action.perform();
	    
	    driver.findElement(By.id("quality_master")).sendKeys("VELVET");
	    Thread.sleep(3000);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("design_master")).sendKeys("#");
	    Thread.sleep(3000);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("chart_master")).sendKeys("#");
	    Thread.sleep(3500);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    
	    Thread.sleep(3500);
	    driver.findElement(By.id("color_master")).sendKeys("#");
	    Thread.sleep(3000);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    
	    driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("100");
	    
	    WebElement unit = driver.findElement(By.name("unit"));
	    
	    Select option = new Select(unit);
	    option.selectByVisibleText("Kg");
//	    option.selectByValue("1");
//	    option.deselectByIndex(0);
	    
//	    Thread.sleep(1000);
	    WebElement rate = driver.findElement(By.xpath("//input[@placeholder='Rate Per Unit']"));
	    rate.sendKeys("25");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Date (dd-mm-yyyy)']")).sendKeys("30");
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()=' Add ']")).click();
	    
	    Thread.sleep(2000);
	    WebElement submit=driver.findElement(By.xpath("//span[text()=' Submit ']"));
	    JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", submit);
		
		String text = driver.findElement(By.xpath("//div[text()=' Added Successfully ']")).getText();
		System.out.println(text);
		
		Assert.assertEquals(" Added Successfully ", text);
		
//		******************************Fabric Purchase Inward****************************************
		
//		WebElement ele = driver.findElement(By.xpath("//button[text()=' Add ']"));
//		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", ele);
//		
//		driver.findElement(By.id("grn")).sendKeys("AKGI-FBR2425-00433");
//		driver.findElement(By.id("ngb-typeahead-0-0")).click();
//		action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    
//	    driver.findElement(By.id("transport")).sendKeys("A2");
////	    Thread.sleep(2000);
//	    driver.findElement(By.id("ngb-typeahead-3-0")).click();
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    
//	    driver.findElement(By.id("company_ledger")).sendKeys("ACE TEX (PURCHASE SURAT)");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//button[@id='ngb-typeahead-4-0']")).click();
//	    Thread.sleep(4000);
//	    action.sendKeys(Keys.TAB);
//	    Thread.sleep(1000);
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    action.sendKeys(Keys.TAB);
//	    
		} 
		catch (Exception e) 
		{
	        e.printStackTrace();
	    }


	}
		
	
}
