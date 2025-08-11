package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_fb {
	
	@FindBy(id="email")
	private WebElement untfield;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pwdtfield;
	
	@FindBy(xpath="//button[.='Log in']")
	private WebElement loginbtn;
	
	public Pom_fb(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void username(String un)
	{
		untfield.sendKeys(un);
	}
	public void password(String pwd)
	{
		pwdtfield.sendKeys(pwd);
	}
	public void login()
	{
		loginbtn.click();
	}
	
	

}
