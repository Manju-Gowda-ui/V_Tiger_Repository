package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_yt {
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement srcfield;
	
	@FindBy(xpath="(//yt-icon[@class='style-scope ytd-searchbox'])[2]")
	private WebElement srcbtn;
	
	public Pom_yt(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchf(String sr)
	{
		srcfield.sendKeys(sr);
	}
	
	public void searchc()
	{
		srcbtn.click();
	}

}
