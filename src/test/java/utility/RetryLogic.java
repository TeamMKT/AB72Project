package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialCount=0;//instnace varibale
	int retryCount=1;//instnace varibale
	@Override
	public boolean retry(ITestResult result)//local
	{
		if(initialCount<retryCount)//0<2 1<2 2<2
		{
			initialCount++;
			return true;
		}

		return false;
	}

}
