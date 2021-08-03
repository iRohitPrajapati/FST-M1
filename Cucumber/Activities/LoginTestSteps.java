package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
	WebDriver driver;
	
	@Given("^User is on Login page$")
	public void user_is_on_Login_page() {
		// Instantiate fireFox browser
		driver = new FirefoxDriver();
		// Get URL
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@When("^User enters username and password to login$")
	public void user_enters_username_and_password_to_login() {
	    // Enter Username
		driver.findElement(By.id("username")).sendKeys("admin");
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("password");
		// Login
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("^Read the page title$")
	public void read_the_page_title() {
	    // Read Page Title
		System.out.println("Title of the page: "+ driver.getTitle());
	}

	@Then("^Read confirmation message$")
	public void read_confirmation_message() {
		String message = driver.findElement(By.id("action-confirmation")).getText(); 
	    // Read Confirmation Message
	    System.out.println("Confirmation Message: "+ message);
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() {
		// Close driver
		driver.close();
	}
}
