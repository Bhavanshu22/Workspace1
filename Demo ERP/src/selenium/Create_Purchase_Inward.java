package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Create_Purchase_Inward {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\eclipse-workspace\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://deploy.techstile.in/#/authentication/sign-in");

		driver.findElement(By.name("email")).sendKeys("ace_aessuper");
		driver.findElement(By.name("password")).sendKeys("aes");
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();

		WebElement transaction = driver.findElement(By.xpath("//span[@id='menubar_3_label']"));
		WebElement trading = driver.findElement(By.xpath("//span[@id='menubar_3_5_label']"));
		WebElement fabric = driver.findElement(By.xpath("//span[@id='menubar_3_5_0_label']"));
		WebElement purchase = driver.findElement(By.xpath("//span[@id='menubar_3_5_0_0_label']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(transaction).build().perform();
		Thread.sleep(2000);
		act.moveToElement(trading).build().perform();
		Thread.sleep(2000);
		act.moveToElement(fabric).build().perform();
		Thread.sleep(2000);
		act.moveToElement(purchase).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Inward'])[1]")).click();
		
		WebElement addButton = driver.findElement(By.xpath("//button[text()=' Add ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);
		

	}

}
