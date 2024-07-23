package testNg;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Hello world ");
		Assert.assertTrue(false);
		System.out.println("hello ");
	}
	
	@Test(enabled=false)
	public void test2()
	{   
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Hello world ");
		softAssert.assertTrue(false);
		System.out.println("hello ");
		
		softAssert.assertAll();
	}
	@Parameters({"username"})
	@Test
	public void test3(String username)
	{
		System.out.println(username);
	}
	
	
 

}
