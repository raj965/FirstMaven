package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.generics.FWutils;

public class EnterTimeTrackPage {
	FWutils fw=new FWutils();
	public WebDriver driver;
	
   @FindBy(id="logoutLink")
   private WebElement logoutBtn;
   
   @FindBy(xpath="//div[text()='TASKS']/..")
   private WebElement clicktaskTab;
   
   @FindBy(xpath="//div[contains(text(),'Settings')]/..")
   private WebElement settings;
   
   @FindBy(xpath="//a[contains(text(),'Licenses')]")
   private WebElement License;
   
   public EnterTimeTrackPage(WebDriver driver) 
   {
   PageFactory.initElements(driver,this);
   }
   
   public void ClickLogout()
   {
	   logoutBtn.click();
   }
   
   public void clicktaskTab()
   {
	   clicktaskTab.click();
   }
   
   public void Settings()
   {  
	  settings.click();	  
   }
   public void Licenses()
   {
	    License.click();
   }
   
   public void VerifyETP(WebDriver driver,String expectedTitle )
   {
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
	   Reporter.log("ExpectedTitle Is Displayed Successfully"+expectedTitle,true);
   }

}
