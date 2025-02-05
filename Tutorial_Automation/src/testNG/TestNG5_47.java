package testNG;

import org.testng.annotations.Test;

public class TestNG5_47 
{
	@Test(groups = {"Regression"})
	public void a()
	{
		System.out.println("a Method");
	}
	
	@Test(groups = {"Regression"})
	public void b()
	{
		System.out.println("b Method");
	}
	
	@Test(groups = {"Regression"})
	public void c()
	{
		System.out.println("c Method");
	}
	
	@Test(groups = {"Regression"})
	public void d()
	{
		System.out.println("d Method");
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void e()
	{
		System.out.println("e Method");
	}
	
	@Test(groups = {"smoke", "Regression"})
	public void f()
	{
		System.out.println("f Method");
	}
	

}
