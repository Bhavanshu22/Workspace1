package testNG;

import org.testng.annotations.Test;

public class TestNG6_47 
{
	@Test
	public void a()
	{
		System.out.println("a Method");
	}
	
	@Test(invocationCount = 2, priority =-1, enabled= true & false)
	public void b()
	{
		System.out.println("b method");
	}
	
	@Test(invocationCount = 2)
	public void c()
	{
		System.out.println("c method");
	}

	
}
