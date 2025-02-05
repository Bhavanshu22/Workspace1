package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
	
	@Test(groups= {"smoke"})
	public void Test3()
	{
		System.out.println("Good");		
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}

}
