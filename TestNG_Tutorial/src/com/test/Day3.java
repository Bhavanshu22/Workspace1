package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 
{
	@BeforeClass
	public void befoclas()
	{
		System.out.println("Excuting before all the method in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		//Selenium
		System.out.println("WebloginCarloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afforeevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void aftclas()
	{
		System.out.println("Excuting after all the method in the class");
	}
	
	@Test(groups= {"smoke"})
	public void MobileloginCarLoan()
	{
		//Appium
		System.out.println("MobileloginCarloan");
	}
	
	@Test(enabled = false) // if there is bug in test case and which is already known then want skip test case use this
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("Mobile SignIN");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobile SignOut");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeSuite
	public void BfSuit()
	{
		System.out.println("I am no 1");
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan","MobileloginCarLoan"}) // if we need to execute this method before these 2 methods then we use such annotation
	public void APILoginCarLoan()
	{
		//Rest API automation
		System.out.println("APILoginCarloan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1. combination - username password - good credit history
		//2. username password - no credit history
		//3. user password - fraudelent credit history
		
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
	}

}
