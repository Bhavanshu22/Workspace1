package SeleniumPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
//		1st Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=1]")).click(); //Female
		driver.findElement(By.xpath("//input[@value=2]")).click(); //Male
		driver.findElement(By.xpath("//input[@value=-1]")).click(); //Custom
		
//		2nd way
		List<WebElement> radios =driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons :" + radios.size());
		System.out.println(radios.get(0).isSelected()); //false
		System.out.println(radios.get(1).isEnabled()); //True
		System.out.println(radios.get(2).isDisplayed()); //True
		
//		3rd way
		List<WebElement> radioText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		System.out.println("Total Radio button Text : " + radioText.size());
		String expresult="Female";
		
		for(int i=0;i<radioText.size();i++)
		{
			if(radioText.get(i).getText().equalsIgnoreCase(expresult))
			{
				radioText.get(i).click();
				System.out.println(expresult + " Clicked");
			}
		}
	}

}
