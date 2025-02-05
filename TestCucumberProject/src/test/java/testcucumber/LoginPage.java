package testcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage 
{
	WebDriver driver;
	
	@Given("I am the user of facebook application")
	public void I_am_the_user_of_facebook_application()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KrishnaKadam\\Pictures\\Screenshots\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@When("I enter user name as {string}")
	public void I_enter_user_name_as(String username)
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@When("I enter Password as {string}")
	public void I_enter_Password_as(String password)
	{
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Then("I should be able to login successfully")
	public void I_should_be_able_to_login_successfully()
	{
		System.out.println("User logged in successfully");
	}
	
	@Then("I should not be able to login successfully")
	public void i_should_not_be_able_to_login_successfully() {
		System.out.println("User logged in not successfully");
	}
	
	@When("I enter the credUsername {string}")
	public void I_enter_the_credUsername(String username)
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@When("I enter the credPassword {string}")
	public void I_enter_the_credPassword(String password)
	{
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
