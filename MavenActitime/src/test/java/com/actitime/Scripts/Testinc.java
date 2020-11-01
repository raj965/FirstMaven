package com.actitime.Scripts;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.Inc;

public class Testinc extends BaseTest{
@Test
public void Test_inc() throws InterruptedException
{

	Inc in=new Inc(driver);
	in.ClickInc();
	Thread.sleep(1000);
	in.windowshandel(driver, "actiTIME - Time Tracking Software for Boosting Your Business");
}
}
