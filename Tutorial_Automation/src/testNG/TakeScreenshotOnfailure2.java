package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnfailure2 
{
	TakeScreenshotOnfailure1_48 t1 = new TakeScreenshotOnfailure1_48();
	
	@Test
	public void doligin()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
        t1.driver = new ChromeDriver();
        t1.driver.manage().window().maximize();
        t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        t1.driver.get("https://www.facebook.com//");
        t1.driver.findElement(By.id("email")).sendKeys("12345");
//        wrong id for password filed
        t1.driver.findElement(By.id("wrong_pass")).sendKeys("12345");
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result2) throws Exception
	{
		t1.captureScreenshot(result2);
	}
}
