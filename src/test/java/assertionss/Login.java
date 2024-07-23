package assertionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Login {
	
	String s;   //null       //instance variable 
	int a;      // 0
	@Test
	public void test6()
	{
	    //local variables are empty int, char, String 
		//System.out.println(s);
	    Assert.assertNull(s);
	}
	
	@Test
	public void test7()
	{
		Assert.assertNotNull(s);
	}
	
	
	/** login with valid credentials */
	@Test
	public void verifyLoginWithValidCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Xpractice");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("XSuperSecretPassword!");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
String act=driver.findElement(By.xpath("//i[text()=' Logout']")).getText();
     Assert.assertEquals("Logout",act);
     /** Test case is getting failed , the rest of code in that 
      * method will not be executed  */
     
    
     
 
		
	} 
	
	@Test
	public void test2()
	{
		String s="hello";
		String s2="hello";
		
		Assert.assertNotEquals(s, s2,"Value Equals"); //fail
		System.out.println("AFter test case --> code");
		
		
	}
	
	@Test
	public void test3()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String s=driver.getPageSource();
		boolean b=s.contains("You logged into a secure area!");
		System.out.println(b);
	    // in var --> ture 
		Assert.assertTrue(b);
		
		//equals 
		//notEquals
		//assertTrue(true);
		//assertFalse(false);
	}
	
	@Test
	public void test5()
	{
		String s="hello world i am learning java ";
		boolean b=s.contains("java");
		Assert.assertFalse(b);
		//
	}
   

	
	
	
	
	@Test(enabled=false)
	public void test1()
	{
		String s1="Logout";
		String s2=new String("Logout");
		if(s1.equals(s2)) 
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test failed ");
		}
	}
	


}
