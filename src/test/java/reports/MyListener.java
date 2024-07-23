package reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class MyListener extends SetUp implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		tkScrnShot();
	}
	
	@Attachment(type="image/png", value="MyScreenshot")
	public  byte[] tkScrnShot()
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		return tk.getScreenshotAs(OutputType.BYTES);
	}
	
	

}
