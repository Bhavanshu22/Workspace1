package SeleniumPakage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
//		Step 1 - Tab Handling
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		
//		Get the total number of open tabs/windows
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		Iterator<String> abc = allWindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		
//		Print the Title of parent tab
		driver.switchTo().window(win1);
		System.out.println("Parent Window Id: "+ win1);  //Alphanumeric id of parent window
		System.out.println(driver.getTitle());
		
//		Print the current url of child tab
		driver.switchTo().window(win2);
		System.out.println("Parent Window Id: "+ win2);  //Alphanumeric id of parent window
		System.out.println(driver.getCurrentUrl()); // Current url of child tab
		

		
//		Step 2 - Windows/Popup  Handling
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('windowButton').click()");
		
//		Print title of Child Window
		Set<String> allWindowsID2 = driver.getWindowHandles();
		System.out.println(allWindowsID2);
		Iterator<String> abc1 = allWindowsID.iterator();
		String win3 = abc1.next();
		String win4 = abc1.next();
		Thread.sleep(2000);
		driver.switchTo().window(win4);
		Thread.sleep(2000);
		System.out.println("Child Window Id: "+ win4);  //Alphanumeric id of Child window
		System.out.println(driver.getTitle()); //Get title of Child window
		System.out.println(driver.getCurrentUrl());  //Get current Url of child window
		Thread.sleep(2000);
		driver.quit(); // Close Parent Window as well as all associated window
		System.out.println("Windows Popup and TAbs Handled");
		
		
	}

}
