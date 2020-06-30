package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddProject {
	@FindBy(xpath = "//div[contains(text(),'TASKS')]")
	private WebElement clickTaskTab;

	@FindBy(xpath = "//div[contains(text(),'Add New')]")
	private WebElement clickTask;

	@FindBy(xpath = "//div[contains(text(),'+ New Project')]")
	private WebElement NewProj;
	
	@FindBy(id = "projectPopup_projectNameField")
	private WebElement EnterProjName;
	
	@FindBy(xpath = "//div[contains(text(),'Project already exists')]")
	private WebElement ProjErr;
	
	
	
	@FindBy(id = "projectPopup_customerSelectorPlaceholder")
	private WebElement SelectCstmr;
	
	@FindBy(xpath = "//img[@class='x-menu-item-icon ']")
	private WebElement SelectNewCtmr;
	
	@FindBy(id="projectPopup_newCustomerNameField")
	private WebElement EnterCustomer;
	
	@FindBy(xpath = "//div[contains(text(),'Customer already exists')]")
	private WebElement CtrmErr;
	
	
	@FindBy(xpath = "//li[@class='x-menu-list-item']")
	private List<WebElement> SelectCusFromList;
	
	@FindBy(xpath = "//span[contains(text(),'Create Project')]")
	private WebElement ClickCreateProj;
	
	@FindBy(id = "closeProjectLightBoxBtn")
	private WebElement ClickXBtn;
	
	public AddProject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClicKaddTAPRo()
	{
		clickTaskTab.click();
		clickTask.click();
		NewProj.click();
	}
	
	public void EnterProjName(String proName)
	{
		EnterProjName.sendKeys(proName);
	}
	
	public void HandelProjErr(WebDriver driver)
	{
		if(ProjErr.isDisplayed())
		{
			Reporter.log("Proj under the Customer is already Created",true);
			ClickXBtn.click();
			driver.switchTo().alert().accept();
		}
		
		else
		{
			Reporter.log("Project Created Successfully",true);
		}
	}
	public void EnterCstmrName(String CstrName) throws InterruptedException
	{
		SelectCstmr.click();
		Thread.sleep(2000);
		SelectNewCtmr.click();
		Thread.sleep(2000);
		EnterCustomer.sendKeys(CstrName);
	}
	public void HandelCstmErr(WebDriver driver,String Name) throws InterruptedException
	{
		if(CtrmErr.isDisplayed())
		{
			Reporter.log("Enter CustomerName is already Present ", true);
			SelectCstmr.click();
			Thread.sleep(1000);
			for(WebElement i:SelectCusFromList)
			{
				String ctname = i.getText();
				System.out.println(ctname);
				if(ctname.equals(Name))
				{
					i.click();
					break;
				}
			}
			ClickCreateProj.click();
		}
		else
		{
			Reporter.log("Customer Created sucessfuly", true);
		}
	}
	
	public void ClickCreatProj()
	{
		ClickCreateProj.click();
	}
}
 