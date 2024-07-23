package dataProviders;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrnShot {
	
	@Test
	public void takScrn() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		//1. convert driver to takesScrnshot interface 
		
		 TakesScreenshot tk=(TakesScreenshot)driver;
		 File file=tk.getScreenshotAs(OutputType.FILE);
		 Date d1=new Date();
		 long l=d1.getTime();
		 FileUtils.copyFile(file,new File("./"+l+"MyScrnShot.png"));
		
	}
	
	

}
