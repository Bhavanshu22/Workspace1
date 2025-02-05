package SeleniumPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
		
//		Lanching chrome browser instance
		WebDriver driver= new ChromeDriver();
		
//		wait for given time
		Thread.sleep(2000);
		
//		open Url using get() method
		driver.get("https://www.facebook.com/login.php/");
		
//		Maximum the window also fullscreen
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

//		open url using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
//		Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
//		Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
//		Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
//		Fetch current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
//		Fetch title of the Web page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
//		close browser instance
		Thread.sleep(2000);
		driver.close();
	}

}
