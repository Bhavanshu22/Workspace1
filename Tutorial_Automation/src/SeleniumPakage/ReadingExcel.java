 package SeleniumPakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws IOException 
	{
//		Specify the location of Excel file
		File src = new File("C:\\Users\\KrishnaKadam\\Downloads\\CK OEE Report (1).xlsx");
		
//		Load file
		FileInputStream fis = new FileInputStream(src);
		
//		Load workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
//		load worksheet
		XSSFSheet sh= wb.getSheet("sheet");
		
//		Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
//		Print 11.5 from Excel sheet 
		System.out.println(sh.getRow(1).getCell(1).getNumericCellValue());
		
//		Print Machine No from Excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
//		Print total Number of rows - 1st way
		System.out.println("Total Rows: "+ sh.getPhysicalNumberOfRows());
		
//		Print total number of rows - 2nd way
		System.out.println("Total Rows: "+ sh.getLastRowNum() + 1);
		
//		Print total number of columns - 1 way
		System.out.println("Total Columns: "+ sh.getRow(1).getPhysicalNumberOfCells());
		
//		Print total number of columns - 2nd way
		System.out.println("Total Columns: "+ sh.getRow(1).getLastCellNum());
		
		
//		Real Time Implementation
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        driver.get("https://www.facebook.com//");
        
        String abc = sh.getRow(0).getCell(0).getStringCellValue();
        driver.findElement(By.id("email")).sendKeys(abc);
		
		

	}

}
