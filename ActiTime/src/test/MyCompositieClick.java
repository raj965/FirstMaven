package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCompositieClick {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.get("https://www.flipkart.com");
	   
	   driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	   
	   driver.findElement(By.name("q")).sendKeys("Redmi Note 9 Pro (Aurora Blue, 128 GB)");
	   
	   driver.findElement(By.className("vh79eN")).click();
	   
	  // driver.findElement(By.className("_3wU53n")).click();
	   
	   //driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']/..")).click();
}
}