package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNG7_48 
{
	@Test
	public void z()
	{
		Assert.assertTrue(3<12);
		System.out.println("z method");
	}
	
	@Test
	public void a()
	{
		Assert.assertTrue(3 < 12 & 4 > 5 );
		System.out.println("a method");
	}
	
	@Test(dependsOnMethods = {"z", "a"})
	public void b()
	{
		System.out.println("b method");
	}

}
