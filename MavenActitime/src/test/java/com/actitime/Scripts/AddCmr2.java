package com.actitime.Scripts;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.AddProject;
import com.actitime.pages.LogInPage;

public class AddCmr2 extends BaseTest {
@Test(invocationCount = 5)
public void Te_01() throws InterruptedException{
	LogInPage lp=new LogInPage(driver);
	lp.login();
	AddProject ap=new AddProject(driver);
	ap.ClicKaddTAPRo();
	Thread.sleep(1000);
	ap.EnterProjName("Anand5");
	Thread.sleep(1000);
	ap.EnterCstmrName("rajkumar8");
	Thread.sleep(1000);
	ap.ClickCreatProj();
	Thread.sleep(1000);
	ap.HandelCstmErr(driver, "rajkumar8");
	Thread.sleep(1000);
	ap.HandelProjErr(driver);
	
	
}
}
