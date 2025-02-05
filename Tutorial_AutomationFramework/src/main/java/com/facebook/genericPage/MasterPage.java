package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage 
{
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;
	
	
	public MasterPage() throws Exception
	{
//  	configuration properties file implementation
		FileInputStream ip = new FileInputStream("./src/main/java/com/facebook/repository/config.properties");
		prop = new Properties();
		prop.load(ip);
		
//		locators properties file implementation
		FileInputStream fs = new FileInputStream("./src/main/java/com/facebook/repository/locators.properties");
		or = new Properties();
		or.load(fs);
		
//		testdata properties file implementation
		FileInputStream ts = new FileInputStream("./src/main/java/com/facebook/repository/testdata.properties");
		td = new Properties();
		td.load(ts);
		
//		Launching Browsers - chrome / firefox / edge
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\My Project\\My_Workspace\\Tutorial_AutomationFramework1\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver",".\\src\\main\\java\\com\\facebook\\drivers\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("No browser details found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

}
