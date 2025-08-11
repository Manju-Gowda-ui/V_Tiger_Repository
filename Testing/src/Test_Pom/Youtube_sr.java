package Test_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.Pom_yt;

public class Youtube_sr {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		Pom_yt p = new Pom_yt(driver);
		p.searchf("Kantara kannada songs");
		p.searchc();
		Thread.sleep(2000);
		
		

		
	}		
}
