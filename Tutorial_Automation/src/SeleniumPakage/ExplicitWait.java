package SeleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Explicit Wait :- It is known as conditional wait, WIll use to fulfill the condition to be satisfied

public class ExplicitWait {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
//			Enter Usernme
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			
//			Fetch input box attribute value
			System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
			
//			Use Explicit wait
			WebDriverWait wt = new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
			
			

	}

}
