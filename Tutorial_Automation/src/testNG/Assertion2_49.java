package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2_49 
{
	@Test
	public void Testcase2()
	{
		String actualText = "abc";
		String expectedText = "ab";
		
		int a=10;
		int b=20;
		
//		Equal Assertion 
		Assert.assertEquals(actualText, expectedText,"Actual and Excepted are not Matching");
		System.out.println("Equal Assertion Verified");
		
//		False Assertion
		Assert.assertFalse(a>b);
		System.out.println("False Assertion Verified");
		
//		True Assertion
		Assert.assertTrue(a>b);
//		Assertion Failed, Test Execution will stop here.
//		Further line of code will not execute
		System.out.println("True Assertion Verified");

	}
	
	@Test
	public void testcase3()
	{
//		Assertion is written in testcase2() method
//		Scope of assertion will be limited to testcase2() method
		System.out.println("Hello tesetcase3() method");
	}

}
