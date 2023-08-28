package Module1;
//class1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//step1 declaration
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;  //private WebElement signIN=driver.findElement(By.xpath(""))
    
	//step2 initialization
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3 usage
	public void ClickPBSignpagesignIn()
	{
		SignIn.click();
	}
}
