package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyDoubleClick {
static
	{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/");
	
	WebElement appraj = driver.findElement(By.xpath("//a[contains(text(),'Apparaj/')]"));
	
	Actions act=new Actions(driver);
	act.doubleClick(appraj).perform();
	
	WebElement actio = driver.findElement(By.xpath("//a[contains(text(),'Actions/')]"));
	
	Actions act1=new Actions(driver);
	act1.doubleClick(actio).perform();
}
}
