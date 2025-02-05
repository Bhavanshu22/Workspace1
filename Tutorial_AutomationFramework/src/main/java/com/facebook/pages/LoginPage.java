package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods 
{

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	Click On Email Filed
	public void clickEmail()
	{
		clickWebElement("Email");
		handleLogger("LoginPage", "Clicked Email Field");
	}
	
//	Enter Email
	public void enterEmail()
	{
		enterData("Email", "TestData1");
		handleLogger("LoginPage", "Entered Email Field");
	}
	
//	Cleared an Email Filed
	public void clearEmail()
	{
		clearData("Email");
		handleLogger("LoginPage", "Cleared Email Filed");
	}
	
//	Click on Password Filed
	public void clickPassword()
	{
		clickWebElement("Password");
		handleLogger("LoginPage", "Clicked Password Filed");
	}
	
//	Enter Password
	public void enterPassword()
	{
		enterData("Password","TestData2");
		handleLogger("LoginPage", "Entered Password");
	}
	
//	Clear Password Filed
	public void clearPassword()
	{
		clearData("Password");
		handleLogger("LoginPage","Cleared Password Filed");
	}
	
//	Get Facebook text
	public void getFacebookText()
	{
		getWebElementText("FacebookText");
		handleLogger("LoginPage", "Fetched Facebook Text");
	}
	
//	Click On Login Button
	public void clickLOginButton()
	{
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "Clicked Login Button");	
	}
	

}

