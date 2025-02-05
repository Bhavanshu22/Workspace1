package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 
{
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname)
	{
		//Selenium
		System.out.println("WebloginHome");
		System.out.println(urlname);
	}
	
	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}
	
	

}
