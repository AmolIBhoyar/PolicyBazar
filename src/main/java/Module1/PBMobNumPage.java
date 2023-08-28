package Module1;
//class2

import org.apache.commons.compress.harmony.pack200.NewAttribute.PassAttribute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PBMobNumPage 
{

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement MobNo;
    @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignInWithPWD;
    
    
    public PBMobNumPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void InputPBMobNumPageMobNo(String mobilenum)
    {
    	MobNo.sendKeys(mobilenum);
    }
    
    public void ClickPBMobNumPageSignInWithPWD()
    {
    	SignInWithPWD.click();
    
    }
}

