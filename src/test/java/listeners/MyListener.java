package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener extends SetUp implements ITestListener{



	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName() +" Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	     tkScrn();
	}
	
	
	public void tkScrn() 
	{
		//typecast
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		
		//excption handling 
		
				try {
					FileUtils.copyFile(file, new File("./MyScrnshot1.png"));
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		
		
	}


	

	
	
	

}
