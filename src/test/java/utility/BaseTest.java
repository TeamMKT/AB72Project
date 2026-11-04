package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest  extends ListenersLogic
{
	@Parameters("browser")
	@BeforeMethod
	public void laucnhBrowser(String nameOfBrowser) throws InterruptedException//local variable
	{
		if(nameOfBrowser.equals("edge"))
		{
		 driver=new EdgeDriver();
		// driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		}
		if(nameOfBrowser.equals("chrome"))
		{
		 driver=new ChromeDriver();
		// driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);

		}
		if(nameOfBrowser.equals("firefox"))
		{
		 driver=new FirefoxDriver();
		// driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");

		}
		}

	
	
	@AfterMethod
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		}

}
