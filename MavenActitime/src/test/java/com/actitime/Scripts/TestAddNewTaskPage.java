package com.actitime.Scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.AddNewTaskPage;
import com.actitime.pages.LogInPage;

public class TestAddNewTaskPage extends BaseTest {
	@Test
	public void Test_01() throws InterruptedException
	{
		LogInPage lp=new LogInPage(driver);
		lp.login();
		AddNewTaskPage tp=new AddNewTaskPage(driver);
		tp.AddNewTaskTest("rajkumar");
		Thread.sleep(1000);
		tp.SelectProj("Anand");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rajkumar");
		al.add("Aanad");
		al.add("Apparaj");
		al.add("Indhudhar");
		al.add("Kalai");
		tp.EnterTaskName(al);
		tp.ClickCreatTask();
	}

}
