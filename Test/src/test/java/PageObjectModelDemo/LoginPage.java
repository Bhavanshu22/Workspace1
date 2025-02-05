package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// Without Page factory
public class LoginPage 
{
	WebDriver driver;
	
//	constructor
	LoginPage(WebDriver d)
	{
		driver=d;
	}
	
//	identify web Element
//	create methods of operation to be performed on web elements
	
	By username = By.id("user-name");
	By pwd = By.id("password");
	By loginBtn = By.id("login-button");
	
	public void enterUsername(String name)
	{
		driver.findElement(username).sendKeys("standard_user");
	}
		
	public void enterpassword(String password)
	{
		driver.findElement(pwd).sendKeys("secret_sauce");
	}
	
	public void clickOnloginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	
	

}
