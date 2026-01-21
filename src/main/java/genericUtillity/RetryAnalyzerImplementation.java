package genericUtillity;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer{
int count=1,maxCount=3;
public boolean retry(ITestResult result) {
	// 1<=5 true retry  2<=5 retry .... 5<=5 retry false  stop retrying
	while(count<=maxCount) {
		count++;
		return true;
	}
	return false;
}

}
