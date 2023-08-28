package LibraryFile;


import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass
{
	public WebDriver driver;
	
public void initializeBrowser() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\28janSeleniumSelf\\driver\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.setBinary("C:\\Users\\HP\\Downloads\\chrome-win64");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityClass.getPFdata("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

}
