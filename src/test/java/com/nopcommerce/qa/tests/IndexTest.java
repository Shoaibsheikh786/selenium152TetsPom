package com.nopcommerce.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nopcommerce.qa.pages.Indexpage;

public class IndexTest extends Base{
	

	
	@Test(priority=1)
	public void checkSearch()
	{
		ip.searchProduct("hello");
	}
	
	@Test(priority=2)
	public void checkOnComputer()
	{
		ip.clickOnComputers();
	}
	

}
