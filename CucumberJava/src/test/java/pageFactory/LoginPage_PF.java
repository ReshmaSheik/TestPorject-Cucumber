package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	
	@FindBy(id="name")
	@CacheLookup
	//@CacheLookup
	//CacheLookup can be used to instruct the InitElements() method to cache the element once its located and so that it will not be searched over and over again whenever calling it from any method
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	public LoginPage_PF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void clickOnlogin() {
		btn_login.click();
	}
}
