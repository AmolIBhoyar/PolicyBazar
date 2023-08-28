package module1_login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import Module1.PBHomePage;
import Module1.PBLoginPage;
import Module1.PBMobNumPage;
import Module1.PBMyAccPage;
import Module1.PBProfilePage;
import Module1.PBPwdPage;

public class PBLoginTest1 extends BaseClass
{
	
	//declare globally
	PBLoginPage login;
	PBMobNumPage mob;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	int TCID;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		initializeBrowser();         //baseclass
		
		login=new  PBLoginPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		   //initialize locally
		
		
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.ClickPBSignpagesignIn();
		mob.InputPBMobNumPageMobNo(UtilityClass.getPFdata("MobNum"));
		mob.ClickPBMobNumPageSignInWithPWD();
		pwd.InputPBwdPage(UtilityClass.getPFdata("PWD"));
		pwd.ClickonPBpwdPageSignIN();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException
	{
		TCID =101;
		home.openDDOptionPBHomePageMyacc();
		myacc.clickPbMyAccPageMyProfile();
		profile.SwitcToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
	String actResult=profile.verifyPBProfilePageFullname();
	String expResult=UtilityClass.getTestData(0, 2);
	Assert.assertEquals(actResult, expResult);
	
	}
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver,TCID);
		}
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
