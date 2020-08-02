package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PF {
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
public HomePage_PF(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void checkLogoutIsDisplayed() {
		
		btn_logout.isDisplayed();
	}

}
