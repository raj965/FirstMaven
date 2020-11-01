package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyDragAndDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("E:\\Apparaj");
		WebElement srcBlk4 = driver.findElement(By.xpath("//a[text()='Drag/']"));
		
		WebElement desBlk2 = driver.findElement(By.xpath("//a[text()='Drop/']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(srcBlk4, desBlk2).perform();
}
}
