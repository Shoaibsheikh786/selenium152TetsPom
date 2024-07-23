package reports;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import listeners.MyListener;


public class Report1 extends SetUp{
    
	@Feature("Login Fuctionality") 
	@Description("to verigy the login with valid cred")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void vefigyLoginWithInvalidCredentails()
	{
		
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertTrue(false);
      
		driver.close();
	}
	@Feature("Login Fuctionality") 
	@Description("to verigy the login with valid cred and password")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void vefigyLoginWithInvalidCredentails1()
	{
		 
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertTrue(false);
		driver.close();
	}
	@Feature("Add to Cart") 
	@Description("to verify the add to cart functionality is working")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void vefigyLoginWithInvalidCredentails2()
	{
		
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
	}

}
