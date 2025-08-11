package Test_Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.Pom_fb;

public class Generic_fb {
	
	
	public static WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
		
	}

}
