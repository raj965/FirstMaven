package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LogInPage {
	@FindBy(id="username")
	private WebElement unTB;

	@FindBy(name="pwd")
	private WebElement pwTB;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement chkbx;
	
	@FindBy(xpath="//span[contains(text(),'invalid. ')]")
	private WebElement errMSG;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String un )
	{
		unTB.sendKeys(un);
	}
	public void setPassWord(String pw )
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnCheckBox()
	{
		chkbx.click();
	}
	public void clickOnLogInBtn()
	{
		lgnBTN.click();
	}
	public void login()
	{
		unTB.sendKeys("admin");
		pwTB.sendKeys("manager");
		chkbx.click();
		lgnBTN.click();	
	}
	
	public void login(String un,String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		chkbx.click();
		lgnBTN.click();
	}

	public void verifyErr()
	{
		Assert.assertTrue(errMSG.isDisplayed());
		Reporter.log("Error Message is displayed --> " + errMSG.getText() , true);
	}


}
