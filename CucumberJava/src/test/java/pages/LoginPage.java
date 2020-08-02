package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By txt_username= By.id("name");
	By txt_password= By.id("password");
	By btn_login =By.id("login");
	By btn_logout=By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//Checking we are on the correct page or not
		if(!driver.getTitle().equals("TestProject Demo"))
		{
			throw new IllegalStateException("this is not Loginpage.The current page is "+driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String Username) {
		
		driver.findElement(txt_username).sendKeys(Username);
	}
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void checkLogoutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
}
