package SeleniumPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Dynamic WebTable
//WebTable which is increasing or decreasing size dynamically
//In case of Webtable<table>tag will be there


public class WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
//		Create list of all Companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies: " + allCompanies.size());
		
//		create Current price of all companies
		List<WebElement> currentPrice= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price: "+ currentPrice.size());
		
		String expResult = "ITI";
		
		for(int i=0; i<allCompanies.size();i++)
		{
			if(allCompanies.get(i).getText().equalsIgnoreCase(expResult))
			{
				System.out.println(allCompanies.get(i).getText() +"==" + currentPrice.get(i).getText());
				allCompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
		
		

	}

}
