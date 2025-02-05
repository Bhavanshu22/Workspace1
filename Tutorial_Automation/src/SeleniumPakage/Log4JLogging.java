package SeleniumPakage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging 
{
	public static void main(String[] args) 
	{
//		Create Logger Instance
		Logger logger = Logger.getLogger("Log4JLogging");
		
//		Configure log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\KrishnaKadam\\eclipse-workspace\\Tutorial_Automation\\log4j.properties");
		
//		OPen browser Instance
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        logger.info("Opened Browser Instance");
        
//      Maximize Window
        driver.manage().window().maximize();
        logger.info("Window maximized");
        
//      Implicit Wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
//      Lunch Application
        driver.get("https://www.facebook.com//");
        logger.info("Application Launched");
        
        
//      Check if the WebElement Displayed or not
        try
        {
        	driver.findElement(By.id("emails")).isDisplayed();
        	logger.info("Web Element Found");
        }
        catch(Exception e)
        {
        	logger.info("Failure Alert - Web Element not Found");
        }
        
		

	}

}
