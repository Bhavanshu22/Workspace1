package SeleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoERP {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://prod.aceerpsolutions.com");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("akn_aessuper");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("aes");
	    
	    
		
	}

}
