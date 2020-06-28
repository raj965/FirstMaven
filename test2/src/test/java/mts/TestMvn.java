package mts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestMvn {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	}

@Test
public void Te_01()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.close();
}
}
