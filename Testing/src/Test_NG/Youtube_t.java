package Test_NG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Youtube_t extends Generic {
	
	@Test
	public void search()
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Puma shoes");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		
			}
}
