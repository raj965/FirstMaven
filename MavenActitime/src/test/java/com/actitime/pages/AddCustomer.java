package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomer {
@FindBy(xpath = "//div[contains(text(),'TASKS')]")
private WebElement clickTaskTab;

@FindBy(xpath = "//div[contains(text(),'Add New')]")
private WebElement clickTask;

@FindBy(xpath = "//div[contains(text(),'+ New Customer')]")
private WebElement clickAddCustomer;

@FindBy(id = "customerLightBox_nameField")
private WebElement CreateNewCutomer;

@FindBy(xpath = "//span[contains(text(),'Create Customer')]")
private WebElement ClickCreateCustomer;

@FindBy(xpath = "//div[contains(text(),'Customer with the specified name already exists')]")
private WebElement AlreadyCustomerPresentError;

@FindBy(id = "customerLightBoxCloseButton")
private WebElement ClickXBtn;

public AddCustomer(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Clicktask()
{
	clickTaskTab.click();
	clickTask.click();
}

public void CustomerClck()
{
	clickAddCustomer.click();
}

public void CreateNewCutomer(String cusname)
{
	CreateNewCutomer.sendKeys(cusname);
}
public void clickCreatecstmr()
{
	ClickCreateCustomer.click();
}
public void HanddelErr(WebDriver driver)
{
	if(AlreadyCustomerPresentError.isDisplayed())
	{
		Reporter.log("Created customer is already present", true);
		ClickXBtn.click();
		driver.switchTo().alert().accept();
	}
	else
	{
		Reporter.log("Customer is created Successfully",true);
	}
}
}
