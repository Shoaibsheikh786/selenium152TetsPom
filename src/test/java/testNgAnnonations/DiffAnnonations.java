package testNgAnnonations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DiffAnnonations {
	
	
	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	}
	
	@BeforeTest()
	public void beforeTest()
	{
		
	}
	//on valid credentials 
	//Secure Page page for Automation Testing Practice
	
	//when we are not able to login
	//Login form page for Automation Testing Practice
	@Test
	public void loginTestWithValidCred()
	{
	    String exp="Secure Page page for Automation Testing Practice";
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("prsctice");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sserSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String act= driver.getTitle();
        if(act.equals(exp))
        {
          System.out.println("LOGIN TEST IS PASSED ");	
        }
        else
        {
        	System.out.println("LOGIN TEST IS FALIED");
        }
        
       //if there is any issue 
    //    driver.quit();
	}
	

	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.quit();
	}
	
	
	
	
	
	
	@Test(enabled=false)
	public void checkTools()
	{
	
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("practice");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
      //  driver.quit();
	}
	


}
