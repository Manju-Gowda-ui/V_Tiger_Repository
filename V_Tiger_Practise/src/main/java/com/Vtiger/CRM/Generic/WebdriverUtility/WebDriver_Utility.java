package com.Vtiger.CRM.Generic.WebdriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	public void implicitwait(WebDriver driver, int timeout)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public void Explicitwait(WebDriver driver, WebElement Element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
	public void switchwindowUrl(WebDriver driver, String PartialUrl)
	{
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> itt = tabs.iterator();
		while(itt.hasNext())
		{
			String window_id = itt.next();
			driver.switchTo().window(window_id);
			
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(PartialUrl));
			{
				break;
			}
		}			
	}
	
	public void switchwindowtitle(WebDriver driver, String PartialTitle)
	{
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> itt = tabs.iterator();
		while(itt.hasNext())
		{
			String window_id = itt.next();
			driver.switchTo().window(window_id);
			
			String acturl = driver.getTitle();
			if(acturl.contains(PartialTitle));
			{
				break;
			}
		}			
	}
	
	public void switchFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);	
	}
	
	public void switchFrame(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);	
	}
	
	public void switchFrame(WebDriver driver,WebElement Element)
	{
		driver.switchTo().frame(Element);	
	}
	
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void selectByIndex(WebElement Element,int index)
	{
		Select ss = new Select(Element);
		ss.selectByIndex(index);			
	}
	
	public void selectByValue(WebElement Element,String value)
	{
		Select ss = new Select(Element);
		ss.selectByValue(value);			
	}
	
	public void selectByVisbleText(WebElement Element,String Text)
	{
		Select ss = new Select(Element);
		ss.selectByVisibleText(Text);			
	}
	
	public void action(WebDriver driver, WebElement Element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(Element).perform();
	}
	

}
