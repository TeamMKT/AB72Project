package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener
{
	public static WebDriver driver;//global variable

	
	public void captureScreenshot(ITestResult result, String status)
	{
		  TakesScreenshot ts=        (TakesScreenshot) driver;        
          File source=ts.getScreenshotAs(OutputType.FILE);
          File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\Ab72Project\\test-output\\Screenshot\\"+status+"\\"+result.getName()+".png");        
          try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) //local variable
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		captureScreenshot(result,"Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		captureScreenshot(result,"Fail");

	}

}
