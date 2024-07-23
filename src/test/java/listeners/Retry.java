package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	
	int count=0;
	int retryCount=3; //total number of times we want to execute
	
	//by defalut will get called 
	@Override
	public boolean retry(ITestResult result) {
		if(count<retryCount)
		{
			count++;
			return true;  //execute again
		}
		return false;      //stop execution
	}

}
