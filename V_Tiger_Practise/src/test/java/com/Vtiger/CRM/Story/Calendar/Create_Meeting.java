package com.Vtiger.CRM.Story.Calendar;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Vtiger.CRM.Generic.FileUtility.Excel_Test_Data_Utility;
import com.Vtiger.CRM.Generic.FileUtility.Json_Utility;

public class Create_Meeting {

	public static void main(String[] args) throws IOException, ParseException {
		
		Json_Utility ju = new Json_Utility();
		String browser = ju.getdatafromjson("browser");
		String url = ju.getdatafromjson("url");
		String usn = ju.getdatafromjson("username");
		String pwd = ju.getdatafromjson("password");
		
		Random rn = new Random();
		int random = rn.nextInt(1000);
		
		Excel_Test_Data_Utility eu = new Excel_Test_Data_Utility();
		String en = eu.getDataFromExcel("Calendar", 1, 1) + random;
		String ul = eu.getDataFromExcel("Calendar", 1, 2);
		System.out.println(ul);
		String lu = eu.getDataFromExcel("Calendar", 1, 3);
		System.out.println(lu);
		
		String ul1 = eu.getDataFromExcel("Calendar", 1, 4);
		String lu1 = eu.getDataFromExcel("Calendar", 1, 5);
		
		System.out.println(ul1);
		System.out.println(lu1);
		
		WebDriver driver = null;
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.linkText("Calendar")).click();
		WebElement Add = driver.findElement(By.xpath("//td[contains(@class,'calAddButton')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Add).perform();
		
		WebElement Meeting = driver.findElement(By.xpath("//a[.='Meeting']"));
		Meeting.click();
			
		driver.findElement(By.name("subject")).sendKeys(en);
		WebElement add1 = driver.findElement(By.xpath("(//input[contains(@class,'crm button ')])[1]"));	

		act.scrollToElement(add1); 
		driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		
		Alert al =  driver.switchTo().alert();
		al.accept();
		
		WebElement time1 = driver.findElement(By.xpath("(//select[@id='starthr'])[1]"));
		
		Select s = new Select(time1);
		s.selectByValue("12"); 
		
		WebElement time2 = driver.findElement(By.xpath("(//select[@id='startmin'])[1]"));
		s.selectByValue("00"); 
		
		WebElement time3 = driver.findElement(By.xpath("(//select[@id='endhr'])[1]"));
		s.selectByValue("04"); 
		
		WebElement time4 = driver.findElement(By.xpath("(//select[@id='endmin'])[1]"));
		s.selectByValue("10"); 
		
		act.scrollToElement(add1); 
		driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click(); 
		
		
		
		
		
		
		
		
		
		
		

	}

}
