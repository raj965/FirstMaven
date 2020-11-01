package mts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMn2 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	}

@Test
public void Te_02()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.close();
}

}
