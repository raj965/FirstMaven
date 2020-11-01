package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement srcBlk4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		WebElement desBlk2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(srcBlk4, desBlk2).perform();

	}
}
