package PropertiesFileDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseExample {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		ReadConfigFile ConfigFile = new ReadConfigFile();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(ConfigFile.getUrl());
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(ConfigFile.getUsername());
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(ConfigFile.getPassword());
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}
	

}
