package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.facebook.genericPage.CommonMethods;

//public class PageFactoryLoginPage extends CommonMethods
//{
//	public PageFactoryLoginPage() throws Exception {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@FindBy(xpath ="//input[@id='mail]")
//	WebElement EmailOrPhone;
//	
//	@FindBy(xpath ="//input[@id='mail]")
//	WebElement Password;
//	
//	public void enterEmail(String testdata)
//	{
//		EmailOrPhone.sendKeys(td.getProperty(testdata));
//	}
//	
//	public void enterPassword(String testdata)
//	{
//		Password.sendKeys(td.getProperty(testdata));
//	}
//	
//	
//}

//=======================OR=================================================

public class PageFactoryLoginPage
{
	public PageFactoryLoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//input[@id='email']")
	WebElement EmailOrPhone;
	
	@FindBy(xpath ="//input[@id='pass']")
	WebElement Password;
	
	public void enterEmail()
	{
		EmailOrPhone.sendKeys("abc@gmail.com");
	}
	
	public void enterPassword()
	{
		Password.sendKeys("1234");
	}
	
	
}
