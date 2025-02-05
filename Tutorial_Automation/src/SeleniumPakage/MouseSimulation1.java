package SeleniumPakage;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_c380b95a-926b-4a63-b5ff-815a991886d5_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");

//		Create Electronics Web Element Ref.
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
//		Mouse Simulation using Actions Class 
		Actions act= new Actions(driver);
//		Mouse Hover to electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		driver.findElement(By.xpath("//*[text()='Realme']")).click();
		
		
//		Keyboard Opearations
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men option clicked");
		
//		Right Click on Web Page
		Thread.sleep(2000);
		act.contextClick(electro).build().perform();
		
	}

}
