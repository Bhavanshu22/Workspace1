package SeleniumPakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(2000);
		
//		Find Total Number of frames present on Webpage
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frame: "+ allFrames);
		
//		Check if Element present or not
		for(int i=0;i<allFrames;i++)
		{
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			
			String exeText = "Open Paytm App";
			String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(actText.equalsIgnoreCase(exeText))
			{
				System.out.println("Element Found");
				break;
			}
			else
			{
				System.out.println("Element Not Found");
			}
		}
		
		

	}

}
