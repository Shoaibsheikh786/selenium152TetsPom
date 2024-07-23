package testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	 
	
	//which one will get executed first --> alphabetical order 
	//is it possible to change , yes , priority, defaut 0
     
	//Test --> 1 test 
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("chrome is getting opened ");
	}
	
	//i have not set priority for this one
	@Test
	public void test()
	{
		System.out.println("i am test 1");
	}
	
	@Test(priority=1)
	public  void loginTest()
	{
	  System.out.println("Hello world ");
	}
	
	
	@Test(priority=2, enabled=false)
	public  void  addtoCart()
	{
		System.out.println("hi i am learning java ");
	
	}
	@Test(priority=3)
	public void addHell()
	{
		System.out.println("add Hello");
	}
	@AfterTest
	public void closeTheBrowser()
	{
		System.out.println("driver.quit()");
	}
	
	



}
