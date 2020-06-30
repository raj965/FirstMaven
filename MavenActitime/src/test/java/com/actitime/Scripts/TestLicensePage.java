package com.actitime.Scripts;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.generics.FWutils;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LicensesPage;
import com.actitime.pages.LogInPage;

public class TestLicensePage extends BaseTest {
	FWutils fw=new FWutils();
	@Test(priority = 1)
	public void Test_License() throws InterruptedException
	{
		LogInPage lp=new LogInPage(driver);
		lp.login();
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		fw.ExplicityWaitForTitle(driver, "actiTIME - Enter Time-Track");
		et.VerifyETP(driver, "actiTIME - Enter Time-Track");
		Thread.sleep(1000);
		et.Settings();
		Thread.sleep(1000);
		et.Licenses();
		LicensesPage lic=new LicensesPage(driver);
		fw.ExplicityWaitForTitle(driver, "actiTIME - Licenses");
		lic.VerifLCP(driver, "actiTIME - Licenses");
		Thread.sleep(1000);
		lic.verifyIssueDate("Jul 14, 2017");
		
	}
	@Test(priority = 2)
	public void Test_License1() throws InterruptedException
	{
		LogInPage lp=new LogInPage(driver);
		lp.login();
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		fw.ExplicityWaitForTitle(driver, "actiTIME - Enter Time-Track");
		et.VerifyETP(driver, "actiTIME - Enter Time-Track");
		Thread.sleep(1000);
		et.Settings();
		Thread.sleep(1000);
		et.Licenses();
		LicensesPage lic=new LicensesPage(driver);
		fw.ExplicityWaitForTitle(driver, "actiTIME - Licenses");
		lic.VerifLCP(driver, "actiTIME - Licenses");
		Thread.sleep(1000);
		lic.verifyproductEditon("actiTIME 2017.4");
		
	}


}
