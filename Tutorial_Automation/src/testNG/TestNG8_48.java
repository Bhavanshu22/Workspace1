package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8_48 
{
	WebDriver driver;
	
	@BeforeClass
	public void setEnv()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataset() throws Exception
	{
		File src3 = new File("C:\\Users\\KrishnaKadam\\eclipse-workspace\\Tutorial_Automation\\Repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		Object arr[][] = new Object[3][2];
		arr[0][0] = pro3.getProperty("TestData1");
		arr[0][1] = pro3.getProperty("TestData2");
		
		arr[1][0] = "TestData2";
		arr[1][1] = "TestData2";
		
		arr[2][0] = "TestData3";
		arr[2][1] = "TestData1";
		
		return arr;
	}
	
	@Test(dataProvider = "dataset")
	public void enterdata(String Username, String Password) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Password);
	}

}
