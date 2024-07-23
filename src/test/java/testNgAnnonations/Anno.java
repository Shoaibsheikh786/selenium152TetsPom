package testNgAnnonations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anno {
	public WebDriver driver;
	public String url = "https://integration-1.tycomonitor.com/panel/1411/panel-test";
	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The setup process is completed");

	}

	@BeforeTest
	public void profileSetup() {

		driver.manage().window().maximize();
		System.out.println("The profile setup process is completed");

	}

	@BeforeClass
	public void appSetup() throws InterruptedException {
		Thread.sleep(3000);

		driver.get("https://integration-1.tycomonitor.com/panel/1411/panel-test");
		Thread.sleep(3000);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suru.santhosh@jci.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void clearOperation() throws InterruptedException

	{
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Devices']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Z-Wave Radio']")).click();
		Thread.sleep(1000);

		System.out.println("starting clear operations");
		Thread.sleep(1000);

		WebElement clear = driver.findElement(By.xpath("//span[text()='Start Clear']"));
		clear.click();
		Thread.sleep(2000);
		WebElement ClearCancel = driver.findElement(By.xpath("//span[text()='Stop Clear']"));
		ClearCancel.click();
		Thread.sleep(3000);

		String text = driver.findElement(By.xpath("//div[@class='block clear-widget']//descendant::div[2]")).getText();
		System.out.println(text);

		if (text.equals("CLEAR SUCCESSFUL")) {
			System.out.println("Device cleared successfully");
		} else {
			System.out.println("Device not cleared");
		}

		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void addOperation() throws InterruptedException {
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn devices-add-device-button']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//nav[@class='tabs tabs--noTabLabel']//descendant::div[2]")).click();
	
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	


	@AfterTest
	public void endscript() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("After method is executing");
//		driver.quit();
	}



}
