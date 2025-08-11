package Test_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.Pom_fb;

public class Login {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Pom_fb p = new Pom_fb(driver);
		p.username("9538304797");
		p.password("9538304747");
		p.login();
		
	}
}
