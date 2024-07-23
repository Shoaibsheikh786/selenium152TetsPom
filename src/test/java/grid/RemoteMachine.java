package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoteMachine {
	//download selenium grid , --> start 
	
	// RemoteWebDriver 
	// DesiredCapabilties
	
	WebDriver driver;
	DesiredCapabilities dc;
	@BeforeMethod()
	public void setUp()
	{ 
		//driver=new ChromeDriver();
		//to select the browser
		dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		try {
			driver=new RemoteWebDriver(new URL("http://192.168.56.1:4444"),dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test1()
	{   

		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
	//	Assert.assertEquals(title, "XafFacebook – log in or sign up");
	   //failed 
		System.out.println(title);
	}
	
	@Test
	public void test2()
	{
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
	//	Assert.assertEquals(title, "Google");
		//i want to provide some info in the report
	//	Reporter.log("Google test cases is passed ");
		//pass
		System.out.println(title);
	  
	}
	
	@Test
	public void test3()
	{
		
		driver.get("https://www.x.com");
		String title=driver.getTitle();
	//	Assert.assertEquals(title, "Google");
		//i want to provide some info in the report
	//	Reporter.log("Google test cases is passed ");
		//pass
		System.out.println(title);
	  
	}
	

	
	@AfterMethod
	public void tearDown()
	{  
		if(driver!=null)
		  driver.close();
	}

}
