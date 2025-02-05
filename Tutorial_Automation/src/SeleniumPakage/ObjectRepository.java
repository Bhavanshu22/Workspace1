package SeleniumPakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
//		specify the location of config Properties file
		File src1 = new File("C:\\Users\\KrishnaKadam\\eclipse-workspace\\Tutorial_Automation\\Repository\\config.properties");
		
//		Create FileInputStream class object to read properties file
		FileInputStream fis1 = new FileInputStream(src1);
//		Create properties object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis1);

		
//		specify the location of config Properties file
		File src2 = new File("C:\\Users\\KrishnaKadam\\eclipse-workspace\\Tutorial_Automation\\Repository\\locators.properties");
//		Create FileInputStream class object to read properties file
		FileInputStream fis2 = new FileInputStream(src2);
//		Create properties object to read properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		
//		specify the location of config Properties file
		File src3 = new File("C:\\Users\\KrishnaKadam\\eclipse-workspace\\Tutorial_Automation\\Repository\\testdata.properties");
		
//		Create FileInputStream class object to read properties file
		FileInputStream fis3 = new FileInputStream(src3);
//		Create properties object to read properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
//		setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pro1.getProperty("URL_1"));
		
//		getproperty() method will accept key and return value of that key
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
        Thread.sleep(2000);
        driver.close();
		
	}

}
