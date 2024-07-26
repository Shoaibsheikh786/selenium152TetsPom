package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	
	@Then("close the driver")
	public void closeTheDriver()
	{
		driver.close();
	}
	@Given("open the chrome")
	public void openTheBrowser() {
    driver=new ChromeDriver();
	}
	
	@When("user enters {string}")
	public void enterUrl(String url)
	{
		//System.out.println(url);
		driver.get(url);
	}
	@When("user enters username as {string}")
	public void user_enters_username_as_practice(String user) {
		
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as_super_secret_password(String pass) {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user can see the logout button")
	public void user_can_see_the_logout_button() {
    boolean b=driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).isDisplayed();
    Assert.assertFalse(b);
	}
	
//	@Before(order=1)
//	public void setUp()
//	{   
//		System.out.println("this is chromeDRiver 111");
//		driver=new ChromeDriver();
//	}
//	
//	@Before(order=2)
//	public void setUp2()
//	{
//		System.out.println("this is chromeDRiver 22");
//	}
//	
//	@After(order=1)
//	public void close()
//	{   
//		System.out.println("AFter, this is order 1");
//		driver.close();
//	}
//	@After(order=2)
//	public void close2()
//	{ 
//		System.out.println("AFter, this is order 2");
//	
//	}
//	
//	@BeforeStep
//	public void myStep() {
//		System.out.println("-----> steps <-----");
//	}
//	
//	@AfterStep
//	public void afterSetp()
//	{
//		System.out.println("<----------- AFter Step ------>");
//	}
//	
//	
}
