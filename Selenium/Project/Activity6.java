package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static stepDefinitions.Activity1.driver;

import java.util.List;

public class Activity6 {
	String header;
	
	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String arg2) {
		// Login button on My Account Page
		try {
			driver.findElement(By.linkText("Login")).click();
		} catch(NoSuchElementException nse) {}
		// user name
		driver.findElement(By.name("log")).sendKeys(arg1);
		// Password
		driver.findElement(By.name("pwd")).sendKeys(arg2);
	}

	@And("^Click login button to login$")
	public void click_login_button_to_login() {
		// Login button
		driver.findElement(By.id("wp-submit")).click();
	}

	@Then("^Verify user logsin successfully$")
	public void verify_user_logsin_successfully() {
		List<WebElement> elements = driver.findElements(By.xpath("//img[contains(@class,'avatar')]"));
		if(elements.size()>0)
			System.out.println("User logs in successfully");
		else 
			System.out.println("Log in not successfully");
	}
}
