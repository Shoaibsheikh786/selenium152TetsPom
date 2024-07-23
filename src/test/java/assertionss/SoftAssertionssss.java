package assertionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertionssss {
	
	@Test
	public void test1()
	{   
		SoftAssert s=new SoftAssert();
		
		String s1="hello";
		String s2="lkfjsdkajd";
		
		
		
	//	Assert.assertEquals(s1, s2);
		s.assertEquals(s1, s2); //false , test Fail
		
		System.out.println("hello after Failed ");
		
		//s.assertAll();
	
	
	}
	
	@Test
	public void test3()
	{  
		SoftAssert softAssert=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String s=driver.getPageSource();
		boolean b=s.contains("You logged into a secure area!");
		System.out.println(b);
	    // in var --> ture 
	//	Assert.assertTrue(b);
		
		softAssert.assertTrue(b); // true --> false 
		
		//if we are using multiple assertions 
		
		//equals 
		//notEquals
		//assertTrue(true);
		//assertFalse(false);
		
		softAssert.assertAll();
	}

}
