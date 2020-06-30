package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LicensesPage {
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;

	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;

	public LicensesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyIssueDate(String expectedTitle )
	{
		String actualTitle=issueDate.getText();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Issue Date is Verify"+expectedTitle,true);
	}

	public void verifyproductEditon(String expectedTitle )
	{
		String actualTitle=productEdition.getText();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Product Edition is Verify"+expectedTitle,true);
	}

	public void VerifLCP(WebDriver driver,String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Expected Page is Verify"+expectedTitle,true);
	}

}
