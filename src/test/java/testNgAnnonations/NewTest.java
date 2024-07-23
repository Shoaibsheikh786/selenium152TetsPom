package testNgAnnonations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeSuite()
	public void beforeSutie()
	{
		System.out.println("this is before suite");
	}
	
	@AfterSuite()
	public void afterSuite1()
	{
		System.out.println("This is after suite");
	}
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }
	@BeforeTest
	  public void beforeTest() {
		
		System.out.println("i am before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am after test");
	  }
  @Test(groups="smoke")
  public void test1() {
	  
	  System.out.println("##### I AM TEST1 --> smokeTest ");
  }
  @Test(groups="smoke")
  public void test2()
  {
	  System.out.println("#### i am test2 --> smokeTest");
  }
  
  @Test(groups="reg")
  public void test3()
  {
	  System.out.println("#### i am test3 ---> RegressionTest");
  }
  
  @Test(groups="reg")
  public void test4()
  {
	  System.out.println("#### i am test4 ---> RegressionTest");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("open the url ");
  }

  @AfterMethod
  public void afterMethod() {
	   System.out.println("close the browser");
  }



  

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
