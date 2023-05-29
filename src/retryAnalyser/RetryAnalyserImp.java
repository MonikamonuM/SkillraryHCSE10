package retryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImp implements IRetryAnalyzer{
	
	int count;
	int maxRetries=4;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count< maxRetries) {
			count++;
		return true;
	}
		return false;
}
}
