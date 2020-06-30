package com.actitime.generics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWutils {
	public void TakeScreenShot(WebDriver driver,String path)
	{
		try
		{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Select Index(Select sel,WebElement element,int index)
	{
	 sel=new Select(element);
	 sel.selectByIndex(index);
	 return sel;
	}
	
	public Select VisibleText(Select sel,WebElement element,String text)
	{
	 sel=new Select(element);
	 sel.selectByVisibleText(text);
	 return sel;
	}
	
	public Select Value(Select sel,WebElement element,String value)
	{
	 sel=new Select(element);
	 sel.selectByValue(value);
	 return sel;
	}
	public WebDriverWait ExplicityWaitForTitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains(title));
		return wait;
	}
	public WebDriverWait ExplicityWaitForClick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return wait;
	}
    public void scrollByXaxis(WebDriver driver,WebElement element) 
    {
    	int xaxis = element.getLocation().getX();
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("windows.scrollBy(0,"+xaxis+")");
    }
    public void scrollByYaxis(WebDriver driver,WebElement element) 
    {
    	int yaxis = element.getLocation().getY();
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("windows.scrollBy(0,"+yaxis+")");
    }

}
