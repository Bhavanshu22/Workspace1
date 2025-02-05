package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4_47 
{
	
//	@Test - 1st way (skipping method)
	public void a()
	{
		System.out.println("a test method");
	}
	
//	2nd way - widely used in market
	@Test(enabled = false)
	public void b()
	{
		System.out.println("b test method");
	}
	
	@Test(enabled = true)
	public void c()
	{
		System.out.println("c test method");
	}
	
//	invocation count - 2 times will execute
	@Test(invocationCount = 2)
	public void d()
	{
		System.out.println("d test method");
	}
	
//	invocation count - 0 times will execute
	@Test(invocationCount = 0)
	public void e()
	{
		System.out.println("d test method");
	}
	
//	Conditional Skipping
	@Test
	public void f()
	{
		System.out.println("f test method");
		throw new SkipException("skipping f tst method");
	}
	

}
