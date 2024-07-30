package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scripts {
	
	@Test
	public void test1()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		int a=5;               float b=6.f;
		
		//WebDriver driver2=(WebDriver) driver;
		
		//dataType =(dataType) DATAType
		
		//script --> return document.title
		String script="return document.title";
		
		String title1=(String)js.executeScript(script);
		System.out.println(title1);
		
      WebElement ele=driver.findElement(By.xpath("//input[@id='search-input']"));
      
      js.executeScript("arguments[0].style.border='5px solid red'", ele);
		
	                     
		
		
		
	}

}
