package learning.Ab72Project;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class Tc2_LoginToAmazonAndLogout extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void withvalidCredAndLogout()
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
	
		homepage.hoverOverOnAccountAndList(driver);
		Reporter.log("Hoverover on accountandList is successful");
		homepage.clickOnSignout();
		Reporter.log("Click on signout is successful");

		Assert.assertEquals(loginpage.verifyingLoginPage(), "Sign in or create account");

		Reporter.log("Test case is Pass");


	}
}
