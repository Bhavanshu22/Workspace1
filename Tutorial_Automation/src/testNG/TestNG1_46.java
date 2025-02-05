package testNG;

import org.testng.annotations.*;


// Note : Add TestNG library in build configure path
public class TestNG1_46 
{
	@Test
	public void a2()
	{
		System.out.println("a2 method");
	}
	
	@BeforeTest
	public void b()
	{
		System.out.println("b method"); //2
	}
	
	@BeforeSuite
	public void c()
	{
		System.out.println("c method");  //1 
	}
	
	@AfterMethod
	public void d()
	{
		System.out.println("d method");  //6
	}
	
	@BeforeClass
	public void e()
	{
		System.out.println("e method");  //3
	}
	
	@AfterTest
	public void f()
	{
		System.out.println("f method"); //8
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("g method"); //7
	}
	
	@BeforeMethod
	public void h()
	{
		System.out.println("h method");  //4
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("i method"); //9
	}
	
	@Test
	public void a1()
	{
		System.out.println("a1 method");
	}
	
	@Test
	public void A1()
	{
		System.out.println("A1 method");  //5
	}
	
	public static void main(String[] args) {
		System.out.println("main Method");
	}

}
