package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyTests  extends SetUp {
	
	@Test
	public void test1()
	{   

		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "XafFacebook – log in or sign up");
	   //failed  
	}
	
	@Test
	public void test2()
	{
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		//i want to provide some info in the report
		Reporter.log("Google test cases is passed ");
		//pass
	  
	}
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
