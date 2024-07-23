package com.nopcommerce.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.nopcommerce.qa.pages.Indexpage;
import com.nopcommerce.qa.pages.LoginPage;

public class Base {
	WebDriver driver; //-url detaisl , page,nopcommerce
	Indexpage ip;    //null
	LoginPage lp;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		ip=new Indexpage(driver);
		lp=new LoginPage(driver);
		
	}

}
