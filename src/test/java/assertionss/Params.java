package assertionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
	
   @Parameters({"browser"})
   @Test
   public void login(String browser)
   {
	   
	   WebDriver driver=null;
		 if(browser.equals("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 else if(browser.equals("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 System.out.println("Browser not found");
		 }
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String s=driver.getPageSource();
		boolean b=s.contains("You logged into a secure area!");
		System.out.println(b);
	    // in var --> ture 
		Assert.assertTrue(b);
   }
  
	


}
