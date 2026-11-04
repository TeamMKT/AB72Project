package learning.Ab72Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Tc3_LoginToAmazonSearchTheProduct extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void loginToSearch()
	{
		Reporter.log("Website Launched");
		HomePage homepage=new HomePage(driver);
		homepage.hoverOverOnAccountAndList(driver);
		Reporter.log("hoverOverOnAccountAndList");
		homepage.clickOnSignin();
		Reporter.log("clickOnSignin is successful");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailId();
		Reporter.log("enterEmailId is successful");
		loginpage.clickOnContinueButton();
		loginpage.enterPassword();
		Reporter.log("enterPassword is successful");
		loginpage.clickOnSignin();
		Reporter.log("Click on sigin is successful");
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
		
		homepage.searchTheproduct();
		
		Reporter.log("searchTheproduct is successful");

		Assert.assertEquals(driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']")).size()>40, true);

		Reporter.log("Test case is Pass");


	}
}
