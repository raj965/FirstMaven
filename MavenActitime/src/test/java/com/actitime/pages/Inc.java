package com.actitime.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inc {

//public static WebDriver driver;	
	
@FindBy(xpath = "//a[contains(text(),'actiTIME Inc.')]")
private WebElement ClickInc;

@FindBy(xpath = "//a[contains(text(),'Try Free')]")
private WebElement ClickTryFree;


public Inc(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void ClickInc()
{
	ClickInc.click();	
}

public void ClTry()
{
	ClickTryFree.click();
}
public void windowshandel(WebDriver driver,String ai)
{
	String cwh = driver.getWindowHandle();
	Set<String> awh = driver.getWindowHandles();
	for(String i:awh)
	{
		driver.switchTo().window(i);
		String title = driver.getTitle();
		if(title.equals(ai))
		{
			driver.switchTo().window(i);
			ClickTryFree.click();
			break;
		}
	}
	
}
}
