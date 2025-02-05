package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion1_49 
{
	@Test
	public void Testcase1()
	{
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		String actualText = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
		
//		Equal Assertion
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Equal Assertion Verified");
		
//		False Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isSelected());
		System.out.println("False Assertion Verified");
		
//		True Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
		System.out.println("True Assertion Verified");
	}

}
