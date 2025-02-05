package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void Lastexecution()
	{
		System.out.println("I will execute Last");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am the Last");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Bye");
	}

}
