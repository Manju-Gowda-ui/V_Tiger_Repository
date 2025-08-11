package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(xpath="//h2[contains(.,'Facebook')]")
	private WebElement fbtxt;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement unfield;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pwdfield;
	
	@FindBy(xpath = "//button[@.='Log in']")
	private WebElement login;
	
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void text()
	{
		String t = fbtxt.getText();
		System.out.println(t);
	}
	
	public void username(String un)
	{
		unfield.sendKeys(un);
	}
	
	public void password(String pwd)
	{
		pwdfield.sendKeys(pwd);
	}
	
	public void login()
	{
		login.click();
	}

}
