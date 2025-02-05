package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//OPen Url
		driver.get("https://www.saucedemo.com/");
		
//		find & Enter Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		fine & Enter Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		fine & click Login button
		driver.findElement(By.id("login-button")).click();
		

	}

}
