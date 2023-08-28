package Module1;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
@FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfile;
@FindBy(xpath="//span[text()='Sign out']") private WebElement signout;	

	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPbMyAccPageMyProfile() 
	{
		myProfile.click();
	}
	public void ClickPBMyAccPageSignOut()
	{
		signout.click();
	}

	}


	
	

