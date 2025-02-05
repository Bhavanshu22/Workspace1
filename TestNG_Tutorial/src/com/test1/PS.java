package com.test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS 
{
	//method Variables
	public void doThis()
	{
		System.out.println("I am Here");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("RUn me first");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me Last");
	}

}
