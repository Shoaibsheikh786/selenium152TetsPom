package com.nopcommerce.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
	
	
	//WebElements
	
	@FindBy(xpath="//input[@id='small-searchterms']")
 private	WebElement serach;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
private	WebElement computer;
	
	
	//Page Action Methods 
	
	public void searchProduct(String s)
	{
		serach.sendKeys(s);
	}
	
	public void clickOnComputers()
	{
		computer.click();
	}
	
	// Constructor 
	public Indexpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
