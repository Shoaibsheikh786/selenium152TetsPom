package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSce2 {
	static WebDriver driver;

	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
//		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
//        
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		jse.executeScript("arguments[0].value='hello'",pass,user);

	      
	      js.executeScript("arguments[0].style.border='5px solid red'", user);
		
		
		
//		String script = "arguments[0].value='muneer'";
//		sendkeys(script,user);
//		
//		//Find input field for password
//		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
//        sendkeys(script,pass);
//        
//        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
//        
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click()", login);
	}

	public static void sendkeys(String scr, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(scr, ele);
	}
}
