package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity1 {
	static WebDriver driver;
	String pageTitle;
	
	@Given("^User is on LMS page$")
	public void user_is_on_LMS_page() {
		// Instantiate Browser
		driver = new FirefoxDriver();
		// Get URL
		driver.get("https://alchemy.hguy.co/lms");
	}

	@When("^Get page title$")
	public String get_page_title() {
		pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		return pageTitle;
	}

	@And("^Verify title$")
	public void verify_title_is() {
		// Verify Title matches
		assertEquals("Alchemy LMS – An LMS Application", pageTitle);
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() {
		// Close
		driver.close();
	}
}
