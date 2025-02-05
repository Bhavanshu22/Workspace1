package SeleniumPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
//		1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
        System.out.println(birthMonth.size()); //12
        birthMonth.get(3).click(); //Apr
        Thread.sleep(2000);
        birthMonth.get(8).click(); //Sep
        
//      2nd way
        WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(bm);
        Thread.sleep(2000);
        month.selectByVisibleText("Mar"); //Mar
        Thread.sleep(2000);
        month.selectByValue("12"); //Dec
        Thread.sleep(2000);
        month.selectByIndex(7); //Aug
        System.out.println(month.getFirstSelectedOption().getText()); //Aug - Current selected value
        
//      3rd way*
        List<WebElement> dropdown = month.getOptions();
        System.out.println(dropdown.size());
        for(int i=0;i<dropdown.size();i++)
        {
        	if(dropdown.get(i).getText().equalsIgnoreCase("Sep"))
        	{
        		dropdown.get(i).click();
        	}
        }
        
//      4th way
        Thread.sleep(2000);
        WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
        bm1.sendKeys("Jan");
        
//      5th way
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb");
        
//      Check if dropdown support multi selection
        System.out.println(month.isMultiple()); //False
        month.selectByVisibleText("Apr"); //Apr
        month.selectByValue("12");  // Dec
        month.selectByIndex(7); //Aug
        
//      Deselect the Multi selected Value from dropdown
        month.deselectByValue("12"); //Dec
        month.deselectByVisibleText("Apr"); // Apr
        month.deselectByIndex(7); // Aug
        
	}

}
