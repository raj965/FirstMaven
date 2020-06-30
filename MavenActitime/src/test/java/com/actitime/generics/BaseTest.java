package com.actitime.generics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pages.EnterTimeTrackPage;

abstract public class BaseTest implements IAutoConstant {
	static
	{
		System.setProperty(CH_KEY,CH_VALUE);
		System.setProperty(FB_KEY,FB_VALUE);
	}
	public static int passCount=0,failCount=0;
	public static WebDriver driver;
	
	FWutils tc=new FWutils();
	
	@Parameters("browser")
	@BeforeClass
	public void OpenBrowser(String browser )
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void EnterUrl()
	{
		driver.get(URL);	
	}
  
	@AfterMethod
	public void logOut(ITestResult res)
	{ 
		int testResult = res.getStatus();
		String nametest = res.getName();

		if(testResult==1)
		{
			passCount++;
		}
		else
		{
			failCount++;
			String path = PHOTO_PATH+nametest+".png";
			tc.TakeScreenShot(driver, path);		
		}
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		etp.ClickLogout();
	}
	
	@AfterClass
   public void CloseBrowser()
   {
	   driver.close();
   }


}
