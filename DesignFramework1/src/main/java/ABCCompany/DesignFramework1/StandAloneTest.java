package ABCCompany.DesignFramework1;

import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest 
{
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.seconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("workspace@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("workspace");
		driver.findElement(By.id("login")).click();
		
//		List<WebElement> product= driver.findElements(By.cssSelector(".mb-3"));
		
	}

}
