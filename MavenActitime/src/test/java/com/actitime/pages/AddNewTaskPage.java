package com.actitime.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewTaskPage {
	//FWutils tc=new FWutils();
	public WebDriver driver;
	
	@FindBy( xpath = "//div[contains(text(),'TASKS')]" )
	private WebElement ClickTaskTab ;

	
	
	@FindBy( xpath = "//div[contains(text(),'Add New Task')]" )
	private WebElement AddNewTaskBtn ;
	
	@FindBy(xpath="//div[contains(text(),'Create new tasks')]")
	private WebElement CreateNewTaskTab;
	
	@FindBy(xpath="//div[@id='createTasksPopup_customerSelector']/table")
	private WebElement SelectCustomerInNewTaskTab;
	
	@FindBy(xpath="//li[@class='x-menu-list-item']")
	private List<WebElement> CustomerList;
	
	
	
	
	@FindBy(xpath="//div[@id='createTasksPopup_projectSelector']/table")
	private WebElement SelectProjectInNewTaskTab;
	
	@FindBy(xpath="//li[@class='x-menu-list-item']")
	private List<WebElement> ProjectList;
	
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private List<WebElement> entertaskTB;	
	
	@FindBy(xpath="//span[contains(text(),'Create Tasks')]")
	private WebElement ClickCreateNewTaskBtn;
	
	public AddNewTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddNewTaskBtn()
	{
		AddNewTaskBtn.click();
	}
	
	public void TaskTab()
	{
		ClickTaskTab.click();
	}
	public void CreateNewTaskTab()
	{
		CreateNewTaskTab.click();
	}
	public void SelectCustomer()
	{
		SelectCustomerInNewTaskTab.click();
	}
	public void SelectProject()
	{
		SelectProjectInNewTaskTab.click();
	}
	
	public void AddNewTaskTest(String name) 
	{
		ClickTaskTab.click();
		AddNewTaskBtn.click();
		//tc.ExplicityWaitForClick(driver,CreateNewTaskTab);
		CreateNewTaskTab.click();
		//tc.ExplicityWaitForClick(driver,SelectCustomerInNewTaskTab);
		SelectCustomerInNewTaskTab.click();
		for(WebElement cl:CustomerList)
		{
			String cname = cl.getText();
			System.out.println(cname);
			System.out.println("============");
			if(cname.equals(name))
			{
				cl.click();
				break;
			}
			
		}		
	}
	
	public void SelectProj(String name) throws InterruptedException
	{
		SelectProjectInNewTaskTab.click();
		for(WebElement cl:ProjectList)
		{
			String cname = cl.getText();
			Thread.sleep(1000);
			System.out.println(cname);
			System.out.println("============");
			if(cname.equals(name))
			{
				cl.click();
				break;
			}
			
		}
	}

	public void EnterTaskName(ArrayList<String> etn)
	{
		Random rm=new Random();
		int randomnum = rm.nextInt(100);
		int index=0;
		for(WebElement i:entertaskTB)
		{
			i.sendKeys(etn.get(index)+"_"+randomnum);
			index++;
		}
	}
	public void ClickCreatTask()
	{
		ClickCreateNewTaskBtn.click();
	}

}
