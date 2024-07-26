package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loggss {
	@Test()
	public void vefigyLoginWithInvalidCredentails()
	{  
		Logger lg=LogManager.getLogger();
		
		WebDriver driver=new ChromeDriver();
		lg.info("Chrome got opened ");
		
		driver.get("https://practice.expandtesting.com/login");
	   
		lg.info("url visited");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("myuser");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("myPassword");
	   
		int a=10,b=3;
		
		
		if(a>b)
		{
			lg.error("a isgreaterthn b ");
		}
		
	
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		driver.close();
	
	}

}
