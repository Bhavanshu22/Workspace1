package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnfailure1_48 
{
	WebDriver driver;
	
//	ITestResult will provide us the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
//			Create ref of Takescreenshot Interface and Type casting
			TakesScreenshot ts = (TakesScreenshot) driver;	
			
//			Use getScreenshotAs() to capture the screenshot in File format
//			getScreenshotAS() method return type = File
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
//			copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, Screenshot captured");
		}
	}

}
