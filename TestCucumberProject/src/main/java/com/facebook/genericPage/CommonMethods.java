package com.facebook.genericPage;

import org.openqa.selenium.By;

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

	

}
