package testNG;

import org.testng.Assert;

public class Assertion3_49 {
	public void testcase3() {
		String actualText = "abc";
		String expectedText = "ab";

//		Equal Assertion
		try {
			Assert.assertEquals(actualText, expectedText, "Actual and Expected are not Matching");
		} catch (Error e) {

		}
		System.out.println("Equal Asseertion Verified");
	}

}
