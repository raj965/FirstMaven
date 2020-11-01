package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

public static void main(String[] args) throws AWTException, InterruptedException 
{
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://drive.google.com/drive/my-drive");
	
	WebElement unTB = driver.findElement(By.id("identifierId"));
	unTB.sendKeys("seleniumqsp18");
	
	WebElement unNXTBTNClick = driver.findElement(By.xpath("//span[text()='Next']"));
	unNXTBTNClick.click();
	
	WebElement pwTB = driver.findElement(By.name("password"));
	pwTB.sendKeys("sunil123-1");
	Thread.sleep(1000);
	WebElement pwNXTBTNClick = driver.findElement(By.xpath("//span[text()='Next']"));
	Thread.sleep(2000);
	pwNXTBTNClick.click();
	Thread.sleep(2000);
	WebElement folder = driver.findElement(By.xpath("(//div[@class='bSmy5'])[7]"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.doubleClick(folder).perform();
}
}
