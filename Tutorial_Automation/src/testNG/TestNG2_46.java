package testNG;

import org.testng.annotations.*;

public class TestNG2_46 
{
	@Test
	public void z2()
	{
		System.out.println("z2 test");
	}
	
	
	@AfterMethod
	public void b()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void c()
	{
		System.out.println("After test");
	}
	
	@Test
	public void Z1()
	{
		System.out.println("Z1 test");
	}
	
	@BeforeMethod
    public void a()
    {
		System.out.println("Before Method");
    }
	
	@BeforeSuite
	public void d()
	{
		System.out.println("Before suit");
	}
	
	@Test
	public void z1()
	{
		System.out.println("z1 test");
	}
	
	@AfterSuite
	public void e()
	{
		System.out.println("After suit");
	}
	
	@AfterClass
	public void f()
	{
		System.out.println("After class");
	}
	
	@BeforeTest
	public void g()
	{
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void h()
	{
		System.out.println("Before class");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello main");
	}

}
