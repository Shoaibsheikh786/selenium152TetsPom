package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iwati {
	
//	static long sec=10;
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		By ele=By.xpath("//span[text()='Downloads']");
		By el2=By.xpath("///");
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	//	wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		expWait(driver,ele,5);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click(); //4
		
		// this line also take 10 takes to load some weblement 
		
		//
	//	expWait(driver,el2,10);
		
		//fluentWai; 
	//	FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
	//			.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5));
				
		
		
	}
	
	public static void expWait(WebDriver driver,By loc, int time )
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(loc)).click();
		
	}
	
	public static void fluentWait(WebDriver driver, By loc, int time, int pol)
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(time)).pollingEvery(Duration.ofSeconds(pol));
		
		wait.until(ExpectedConditions.elementToBeClickable(loc)).click();
	}
	

}
