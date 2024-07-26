package dataProviders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	// username1 password1
	// username2 password2
	// username3 password3
	
	
	
	
	@Test(dataProvider="userinfo")
	public void vefigyLoginWithInvalidCredentails(String user,String pass)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
	}
	
	//here i have a dataset which i want to use for the test 
	@DataProvider(name="userinfo")
	public String[][] data()
	{
		String [][]arr= {{"username1","password1"},
		             {"username2","password2"},
		             {"usename3","password3"}};
		
	  //we use return keyword to provide the data and control .
		return arr;
		
	}
	
	//read the data form an excel file 
	//store it in dataprovider 
	//then connect the dataprovide with the test 
	//execute the testcases.
	
	
	@Test(dataProvider="mydata", dataProviderClass=MydataProviders.class)
	public void testData(String username, String password)
	{
		System.out.println("My username is "+username);
		System.out.println("My password is "+password);
		
	}
	
	@Test()
	public void vefigyLoginWithInvalidCredentails2()
	{
		
		Logger lg=LogManager.getLogger(Logger.class.getMethods());
		WebDriver driver=new ChromeDriver();
		lg.info("Chrome opened ");
		
		driver.get("https://practice.expandtesting.com/login");
		lg.info("Url opened");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass1");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
	}
	
	

}
