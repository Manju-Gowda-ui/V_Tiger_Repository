package Test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}
	
	@AfterMethod()
	public void Closeapp()
	{
		driver.close();
		
	}

}
