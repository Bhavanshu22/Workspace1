package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory
public class LoginPage2 
{
	WebDriver driver;
//	Constructor
	LoginPage2(WebDriver d)
	{
		driver = d;
//		this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
//	identify Web element
	
//	identify username
	@FindBy(id="user-name")
	WebElement username;
	
//	identify Password
	@FindBy(id="password")
	WebElement password;
	
//	identify loginbutton
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void enterUsername(String name)
	{
		username.sendKeys(name);
	}
		
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public void clickOnloginBtn()
	{
		loginBtn.click();
	}
	
	

}
