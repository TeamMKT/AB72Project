package learning.Ab72Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	//step 1
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountandList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signOut;

	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtextBox;

	
	//step 2
	
	public void hoverOverOnAccountAndList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandList).perform();
		
	}
	public void searchTheproduct()
	{
		
		searchtextBox.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void clickOnSignin()
	{
		
		signin.click();
	}
	public void clickOnSignout()
	{
		
		signOut.click();
	}
	
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
