
package SeleniumPakage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Implicit Wait - Will prefer to use this one only once in the project, Which will be Applicable throughtout the project.

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

//	    Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");

		List<WebElement> Allsuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Element Found: " + Allsuggestions.size());

		for (int i = 0; i < Allsuggestions.size(); i++) 
		{
			String expectResult = "How stuff works science";
			if (Allsuggestions.get(i).getText().equalsIgnoreCase(expectResult)) 
			{
				Allsuggestions.get(i).click();
				System.out.println("DOne");
				break;
			}
		}

	}

}
