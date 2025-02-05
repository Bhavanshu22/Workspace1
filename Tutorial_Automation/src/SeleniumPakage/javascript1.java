package SeleniumPakage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		Locate Web Element using Javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='abc12345'");
		jse.executeScript("document.getElementsByName('login')[0].click()");
		
		
//		Scroll Down using javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		
		
//		Scroll Up using javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)");

	}

}
