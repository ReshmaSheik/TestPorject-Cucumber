package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	public WebDriver driver;
//	@Given("browser is open")
//	public void browser_is_open() {
//      driver=new FirefoxDriver();
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//      
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//    driver.get("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//	
//
//	}
//	@And("User clicks on login")
//	public void User_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//
//	}
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_homepage()  {
//       driver.findElement(By.id("logout")).isDisplayed();
//      
//       driver.close();
//	}
//


}
