package com.nopcommerce.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//dont write assertions in pageclass
	//return that page , Page , ret
	
	
	WebDriver driver;
	 //3. constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	//1. WebElements 
	
	@FindBy(xpath="//input[@id='Email']")
    private  WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	private WebElement login;
	
	
	//2. Page Action Methods 
	
	public void sendEmail(String e)
	{
		email.sendKeys(e);
	}
	public void sendPassword(String p)
	{
		password.sendKeys(p);
	}
	
	public boolean clickLogin()
	{
		login.click();
		String s=driver.getPageSource();
		boolean b=s.contains("Login was unsuccessful.");
		return b;
		
		//return ProfilePage;
		 
	}
	
	

}
