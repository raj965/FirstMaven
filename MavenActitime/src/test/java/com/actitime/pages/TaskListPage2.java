package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TaskListPage2 {
	@FindBy( xpath = "//div[contains(text(),'TASKS')]" )
	private WebElement ClickTaskTab ;
	
	@FindBy( xpath = "//div[text()='Add New']/parent::div[@class='addNewButton']" )
	private WebElement ClickAddNewButton ;
	
	@FindBy(xpath ="//div[contains(text(),'+ New Customer')]")
	private WebElement ClickNewCustomerBtn;
	
	@FindBy(xpath ="//button[contains(text(),'-- Select an active customer to import information from --')]")
	private WebElement  ClickExistingCutmr;
	
	@FindBy (id="customerLightBox_descriptionField")
	private WebElement EnterDesc;
	
	@FindBy(id="customerLightBox_nameDuplicateError")
	private WebElement verifyCustomerNameDuplicate;
	
	@FindBy(id= "customerLightBoxCloseButton")
	private WebElement ClickXBtnCutomer;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement EnterNewCustomerName;
	
	@FindBy (id="projectPopup_projectDescriptionField")
	private WebElement EnterDescription;
	
	@FindBy (xpath="//span[text()='Create Customer']")
	private WebElement ClickCreatCustomerBtn;
	
	@FindBy(xpath ="//div[contains(text(),'+ New Project')]")
	private WebElement ClickNewProjectBtn;
	
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement EnterProjName;
	
	@FindBy(id="ext-gen99")
	private List<WebElement> SelectCustomerForProject;
	
	@FindBy(xpath ="//div[@id='projectPopup_customerSelectorPlaceholder']")
	private WebElement SelectCustomerForProject1;
	
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement EnterProjDes;
	
	@FindBy(xpath ="//span[contains(text(),'Create Project')]")
	private WebElement ClickCreateProjBtn;
	
	@FindBy(xpath ="//div[contains(text(),'Project already exists')]")
	private WebElement VerifyProj;
	
	@FindBy(xpath ="//a[contains(text(),'-- New Customer --')]")
	private WebElement ClickNewCus;
	
	@FindBy(xpath ="//input[@id='projectPopup_newCustomerNameField']")
	private WebElement EnterCustomerNameInProject;
	
	@FindBy(xpath ="//div[contains(text(),'Customer already exists')]")
	private WebElement CustomerNameAlreadyExist;
	
	@FindBy(xpath ="//li[@class='x-menu-list-item']")
	private List<WebElement> SelectCus;
	
	@FindBy(id="closeProjectLightBoxBtn")
	private WebElement CloseProj;
	
	public TaskListPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickTask()
	{
		ClickTaskTab.click();
	}
	
	public void ClickAddNewTab()
	{
		ClickAddNewButton.click();
	}
	public void ClickAddNewCstmr()
	{
		ClickNewCustomerBtn.click();
	}
	public void CreateNewCustomer(WebDriver driver,String newcustomer,String Des) throws InterruptedException
	{
		EnterNewCustomerName.sendKeys(newcustomer);
		EnterDesc.sendKeys(Des);
		ClickCreatCustomerBtn.click();
		Thread.sleep(1000);
		if(verifyCustomerNameDuplicate.isDisplayed())
		{
			Reporter.log("Enter Customer Name Already Present",true);
			ClickXBtnCutomer.click();
			driver.switchTo().alert().accept();
		}
	}
	
	public void ClickNewProj(WebDriver driver,String ProjName,String cusna,String ProDes) throws InterruptedException
	{
		    EnterProjName.sendKeys(ProjName);
		    Thread.sleep(1000);
			SelectCustomerForProject1.click();
			Thread.sleep(1000);
			ClickNewCus.click();
			EnterCustomerNameInProject.sendKeys(cusna);
			EnterDescription.sendKeys(ProDes);
			ClickCreateProjBtn.click();
			Thread.sleep(1000);	
			if(CustomerNameAlreadyExist.isDisplayed())
			{
				SelectCustomerForProject1.click();
				Thread.sleep(1000);	
				
			for(WebElement i:SelectCus)
			{
				String cusname = i.getText();
				System.out.println(cusname);
				System.out.println("===========");
				if(cusname.equals(cusna))
				{
					i.click();
					break;
				}
			}
			
			EnterDescription.sendKeys(ProDes);
			ClickCreateProjBtn.click();
			}
			Thread.sleep(1000);	
		if(VerifyProj.isDisplayed())
		{
			Reporter.log("Project name is already created",true);
			CloseProj.click();
			driver.switchTo().alert().accept();
		}
	}
		
	public void CreateNewProj()
	{
		ClickNewProjectBtn.click();		
	}

}
