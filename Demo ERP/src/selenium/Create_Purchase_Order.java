package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_Purchase_Order {
	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2500);
		act.moveToElement(transaction).build().perform();
		Thread.sleep(2000);
		act.moveToElement(trading).build().perform();
		Thread.sleep(2000);
		act.moveToElement(fabric).build().perform();
		Thread.sleep(2000);
		act.moveToElement(purchase).build().perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(//span[@class='p-menuitem-text ng-star-inserted'][normalize-space()='Order'])[1]")).click();

		WebElement addButton = driver.findElement(By.xpath("//button[text()=' Add ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company_ledger']")).sendKeys("#");
		Thread.sleep(2000);
		List<WebElement> allSupplierSuggestionlist = driver
				.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
		System.out.println("Supplier Suggestion List size: " + allSupplierSuggestionlist.size());

		String expresult = "ABHISHEK SILK MILLS";

		for (int i = 0; i < allSupplierSuggestionlist.size(); i++) {
			if (allSupplierSuggestionlist.get(i).getText().equalsIgnoreCase(expresult)) {
				System.out.println("Supplier Name:" + allSupplierSuggestionlist.get(i).getText());
				allSupplierSuggestionlist.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='transport']")).sendKeys("#");
		Thread.sleep(2000);
		List<WebElement> alltransportSuggestionlist = driver
				.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
		System.out.println("Transaport Suggestion List size: " + alltransportSuggestionlist.size());

		String expectedtransportname = "Airwide cargo";
		js.executeScript("window.scrollBy(0,50)");
		for (int i = 0; i < alltransportSuggestionlist.size(); i++) {
			if (alltransportSuggestionlist.get(i).getText().equalsIgnoreCase(expectedtransportname)) {
				System.out.println("Transaport Name: " + alltransportSuggestionlist.get(i).getText());
				
				Thread.sleep(2500);
				alltransportSuggestionlist.get(i).click();
				break;
			}
		}
			

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='quality_master']")).sendKeys("#");
			Thread.sleep(2000);
			List<WebElement> allQualitySuggestionlist = driver
					.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
			System.out.println("Quality Suggestion List size: " + allQualitySuggestionlist.size());

			String expectedqualityname = "Bailey";
//			String expectedqualityname [] = new String[allQualitySuggestionlist.size()];
//			for(j=0; j<expectedqualityname.length; j++)
//			{
//				expectedqualityname[j] = allQualitySuggestionlist.get(j).getText();
//			}

			js.executeScript("window.scrollBy(0,200)");
			for (int i = 0; i < allQualitySuggestionlist.size(); i++) 
			{
				Thread.sleep(2000);
				if (allQualitySuggestionlist.get(i).getText().equalsIgnoreCase(expectedqualityname)) 
				{
			    	System.out.println("Quality Name: " + allQualitySuggestionlist.get(i).getText());
			    	
					Thread.sleep(2000);
					allQualitySuggestionlist.get(i).click();
					break;
				}	
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='design_master']")).sendKeys("#");
			Thread.sleep(2000);
			List<WebElement> alldesignSuggestionlist = driver
					.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
			System.out.println("Design Suggestion List size: " + alldesignSuggestionlist.size());

			String expecteddesignname = "Dyed";
//			String expecteddesignname [] = new String[alldesignSuggestionlist.size()];
//			for(j=0; j<expecteddesignname.length; j++)
//			{
//				expecteddesignname[j] = alldesignSuggestionlist.get(j).getText();
//			}

			for (int i = 0; i < alldesignSuggestionlist.size(); i++) {
				Thread.sleep(2000);
				if (alldesignSuggestionlist.get(i).getText().equalsIgnoreCase(expecteddesignname)) {
					System.out.println("Design Name: " + alldesignSuggestionlist.get(i).getText());
					Thread.sleep(2000);
					alldesignSuggestionlist.get(i).click();
					break;
				}
			}
				
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='chart_master']")).sendKeys("#");
			Thread.sleep(2000);
			List<WebElement> allchartSuggestionlist = driver
					.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
			System.out.println("Chart Suggestion List size: " + allchartSuggestionlist.size());

			String expectedchart = "1";
//			String expectedchartname [] = new String[allchartSuggestionlist.size()];
//			for(j=0; j<expectedchartname.length; j++)
//			{
//				expectedchartname[j] = allchartSuggestionlist.get(j).getText();
//			}

			for (int i = 0; i < allchartSuggestionlist.size(); i++) {
				Thread.sleep(2000);
				if (allchartSuggestionlist.get(i).getText().equalsIgnoreCase(expectedchart)) {
					System.out.println("Chart Name: " + allchartSuggestionlist.get(i).getText());
					Thread.sleep(2000);
					allchartSuggestionlist.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='color_master']")).sendKeys("#");
			Thread.sleep(2000);
			List<WebElement> allcolorSuggestionlist = driver
					.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
			System.out.println("Color Suggestion List size: " + allcolorSuggestionlist.size());

			String expectedcolorname = "Chiku";
//			String expectedcolorname [] = new String[allcolorSuggestionlist.size()];
//			for(j=0; j<expectedcolorname.length; j++)
//			{
//				expectedcolorname[j] = allcolorSuggestionlist.get(j).getText();
//			}
			for (int i = 0; i < allcolorSuggestionlist.size(); i++) 
			{
				Thread.sleep(2000);
				if (allcolorSuggestionlist.get(i).getText().equalsIgnoreCase(expectedcolorname))
				{
					System.out.println("Color Name: " + allcolorSuggestionlist.get(i).getText());
					Thread.sleep(2000);
					allcolorSuggestionlist.get(i).click();
					break;
				}
				
			}
			
			driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("500");
			
			WebElement un = driver.findElement(By.xpath("//select[@name='unit']"));
			Select unit = new Select(un);
			List<WebElement> dropdown = unit.getOptions();
			System.out.println("Dropdown Size: " + dropdown.size());
			for(int i=0;i<dropdown.size();i++)
			{
				if(dropdown.get(i).getText().equalsIgnoreCase("Kg"))
				{
					System.out.println("Dropdown: " + dropdown.get(i).getText());
					dropdown.get(i).click();
				}
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Rate Per Unit']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Rate Per Unit']")).sendKeys("15");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='date']")).sendKeys("28");
//			List<WebElement> dates = driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
//			for(int i=0;i<dates.size();i++)
//			{
//				if(dates.get(i).getText().equalsIgnoreCase("15"))
//				{
//					Thread.sleep(2000);
//					dates.get(i).click();
//				}
//			}
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Discount in %']")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()=' Add ']")).click();
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Pending ']")).click();
		
		WebElement statusOptionList = driver.findElement(By.xpath("//select[@placeholder='status']"));
		
		Select status = new Select(statusOptionList);
		List<WebElement> dropdown1 = unit.getOptions();
		System.out.println("Dropdown Size: " + dropdown1.size());
		for(int i=0;i<dropdown1.size();i++)
		{
			if(dropdown1.get(i).getText().equalsIgnoreCase(" CONFIRMED "))
			{
				System.out.println("Dropdown: " + dropdown.get(i).getText());
				dropdown.get(i).click();
			}
		}
		
		
	}

}
