package com.actitime.Scripts;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.LogInPage;
import com.actitime.pages.TaskListPage2;

public class TestNewProj extends BaseTest {
@Test
public void Test_NewProj() throws InterruptedException
{
	LogInPage lp=new LogInPage(driver);
	lp.login();
	TaskListPage2 tp=new TaskListPage2(driver);
	tp.ClickTask();
	tp.ClickAddNewTab();
	tp.CreateNewProj();
	tp.ClickNewProj(driver,"Ananad", "rajkumar", "fuck");
	

}
}
