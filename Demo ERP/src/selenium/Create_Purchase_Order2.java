package selenium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_Purchase_Order2 {
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
		Thread.sleep(2200);
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

		String expresult = "Nirav Textiles";

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

		String expectedtransportname = "Best Roadways Ltd";
		js.executeScript("window.scrollBy(0,50)");
		for (int i = 0; i < alltransportSuggestionlist.size(); i++) {
			if (alltransportSuggestionlist.get(i).getText().equalsIgnoreCase(expectedtransportname)) {
				System.out.println("Transaport Name: " + alltransportSuggestionlist.get(i).getText());
				
				Thread.sleep(2500);
				alltransportSuggestionlist.get(i).click();
				break;
			}
		}
			
		
		    int p=0;
		    String[] Quality = {"AnyTime", "Anything"};
		    
		    for(int e=0;e==Quality.length;e++)
		    {

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='quality_master']")).sendKeys("#");
			Thread.sleep(2000);
			List<WebElement> allQualitySuggestionlist = driver
					.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
			System.out.println("Quality Suggestion List size: " + allQualitySuggestionlist.size());

			List Qualitylist = Arrays.asList(Quality);	
			js.executeScript("window.scrollBy(0,200)");
			for (int i = 0; i < allQualitySuggestionlist.size(); i++) 
			{
				Thread.sleep(3000);
				if (Qualitylist.contains(allQualitySuggestionlist.get(i).getText())) 
				{
					
			    	System.out.println("Quality Name: " + allQualitySuggestionlist.get(i).getText());
					Thread.sleep(2000);
					allQualitySuggestionlist.get(i).click();
					
					js.executeScript("window.scrollBy(0,100)");
					
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='design_master']")).sendKeys("#");
//					Thread.sleep(2000);
//					List<WebElement> alldesignSuggestionlist = driver
//							.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
//					System.out.println("Design Suggestion List size: " + alldesignSuggestionlist.size());
//
////					String expecteddesignname1 = "Dyed";
//					String expecteddesignname [] = new String[alldesignSuggestionlist.size()];
//					for(int d=0; d<expecteddesignname.length; d++)
//					{
//						expecteddesignname[d] = alldesignSuggestionlist.get(d).getText();
//					}
//					
//					List Designlist = Arrays.asList(expecteddesignname);
//
//					for (int d1 = 0; d1 < alldesignSuggestionlist.size(); d1++) {
//						Thread.sleep(2000);
//						if (Designlist.contains(alldesignSuggestionlist.get(d1).getText())) {
//							System.out.println("Design Name: " + alldesignSuggestionlist.get(d1).getText());
//							Thread.sleep(2000);
//							alldesignSuggestionlist.get(d1).click();
//							break;
//						}
//					}
//						
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='chart_master']")).sendKeys("#");
//					Thread.sleep(2000);
//					List<WebElement> allchartSuggestionlist = driver
//							.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
//					System.out.println("Chart Suggestion List size: " + allchartSuggestionlist.size());
//
////					String expectedchart = "1";
//					String expectedchartname [] = new String[allchartSuggestionlist.size()];
//					for(int ch=0; ch<expectedchartname.length; ch++)
//					{
//						expectedchartname[ch] = allchartSuggestionlist.get(ch).getText();
//					}
//
//					List Chartlist = Arrays.asList(expectedchartname);
//					for (int ch1 = 0; ch1 < allchartSuggestionlist.size(); ch1++) {
//						Thread.sleep(2000);
//						if (Chartlist.contains(allchartSuggestionlist.get(ch1).getText())) {
//							System.out.println("Chart Name: " + allchartSuggestionlist.get(ch1).getText());
//							Thread.sleep(2000);
//							allchartSuggestionlist.get(ch1).click();
//							break;
//						}
//					}
//					
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='color_master']")).sendKeys("#");
//					Thread.sleep(2000);
//					List<WebElement> allcolorSuggestionlist = driver
//							.findElements(By.xpath("//typeahead-container[@role='listbox']/button"));
//					System.out.println("Color Suggestion List size: " + allcolorSuggestionlist.size());
//
////					String expectedcolorname = "1-BLACK";
//					String expectedcolorname [] = new String[allcolorSuggestionlist.size()];
//					for(int c=0; c<expectedcolorname.length; c++)
//					{
//						expectedcolorname[c] = allcolorSuggestionlist.get(c).getText();
//					}
//					
//					List Colorlist = Arrays.asList(expectedcolorname);
//					
//					for (int c = 0; c < allcolorSuggestionlist.size(); c++) 
//					{
//						Thread.sleep(2000);
//						if (Colorlist.contains(allcolorSuggestionlist.get(c).getText()))
//						{
//							System.out.println("Color Name: " + allcolorSuggestionlist.get(c).getText());
//							Thread.sleep(2000);
//							allcolorSuggestionlist.get(c).click();
//							break;
//						}
//						
//					}
//					
//					driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("500");
//					
//					WebElement un = driver.findElement(By.xpath("//select[@name='unit']"));
//					Select unit = new Select(un);
//					List<WebElement> dropdown = unit.getOptions();
//					System.out.println("Dropdown Size: " + dropdown.size());
//					for(int u=0;u<dropdown.size();u++)
//					{
//						if(dropdown.get(u).getText().equalsIgnoreCase("Kg"))
//						{
//							System.out.println("Dropdown: " + dropdown.get(u).getText());
//							dropdown.get(u).click();
//						}
//					}
//					
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@placeholder='Rate Per Unit']")).clear();
//					driver.findElement(By.xpath("//input[@placeholder='Rate Per Unit']")).sendKeys("23");
//
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@name='date']")).sendKeys("15");
//					
//					js.executeScript("window.scrollBy(0,100)");
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@placeholder='Discount in %']")).sendKeys("2");
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//a[text()=' Add ']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Reset']")).click();
//					break;
					
				 }
	
				}
		    }
			
			
			
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
	}

}
