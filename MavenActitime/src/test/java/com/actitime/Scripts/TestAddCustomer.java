package com.actitime.Scripts;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.AddCustomer;
import com.actitime.pages.LogInPage;

public class TestAddCustomer extends BaseTest {
@Test
public void Test_02() throws InterruptedException
{
	LogInPage lp=new LogInPage(driver);
	lp.login();
	AddCustomer ac=new AddCustomer(driver);	
	ac.Clicktask();
	ac.CustomerClck();
	ac.CreateNewCutomer("raj");
	Thread.sleep(1000);
	ac.clickCreatecstmr();
	Thread.sleep(1000);
	ac.HanddelErr(driver);
}
}
