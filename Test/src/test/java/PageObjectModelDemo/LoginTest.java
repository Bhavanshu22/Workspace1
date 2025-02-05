package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
//		/Create object of Login page
		
//		LoginPage LoginPg =new LoginPage(driver);
//		
//		driver.get("https://www.saucedemo.com/");
//		
//		LoginPg.enterUsername("standard_user");
//		LoginPg.enterpassword("secret_sauce");
//		LoginPg.clickOnloginBtn();
		
//		create object of LoginPage2
		
        LoginPage2 LoginPg2 =new LoginPage2(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		LoginPg2.enterUsername("standard_user");
		LoginPg2.enterpassword("secret_sauce");
		LoginPg2.clickOnloginBtn();
		

	}

}
