package testNgAnnonations;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	/** After class */
	@BeforeClass
	public void BeforeClass()
	{
	 System.out.println("Before class ");	
	}
	
	/** Before Test */
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("pre-condition of before Test");
	}
	/** After Test*/
	@AfterTest
	public void afterTest()
	{
		System.out.println("pre-conditon closed ");
	}
	

	/** Before Method*/
	@BeforeMethod()
	public void setUpBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	/** After Method */
	@AfterMethod()
	public void quitBrowser()
	{
		System.out.println("Browser closed ");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	
	@Test(groups="g1")
	public void test1()
	{
		System.out.println("######### i am learning java 	TEST 1 ");
	}
	
	@Test(groups="g1")
	public void test2()
	{
		System.out.println("########### i am learnin selenium TEST 2");
	}
	@Test(groups="g2")
	public void test3()
	{
		System.out.println("###########   THIS IS THE TEST 3");
	}
	@Test(groups="g2")
	public void test4()
	{
		System.out.println("#############  THIS IS TEST 4");
	}
	
	@BeforeGroups(value="g2")
	public void befGroups()
	{
		System.out.println("&&&&&&&&Before groups ");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	public static void main(String[] args) {
		
		
	}
}
