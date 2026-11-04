package learning.Ab72Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	//step 1
	
	@FindBy(name="email")
	private WebElement emailid;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;
	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	private WebElement signinOrCreateAccounttext;
	
	
	//step 2
	
	public void enterEmailId()
	{
		
		emailid.sendKeys("mkumarban@gmail.com");
	}
	public void clickOnContinueButton()
	{
		
		continuebutton.click();
	}
	public void enterPassword()
	{
		
																				password.sendKeys("Sunita0309!@#");
	}
	
	
	public void clickOnSignin()
	{
		
		signin.click();
	}
	
	//step 3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyingLoginPage()
	{
		
		String title=	signinOrCreateAccounttext.getText();
		
		return title;
	}
	
	
}
