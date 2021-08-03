package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;
	
	@Given("^User is on the page$")
	public void user_is_on_the_page() {
		// Instantiate Browser
		driver = new FirefoxDriver();
		// Wait
		wait = new WebDriverWait(driver, 10);
		// Get URL
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}

	@When("^User clicks the Simple Alert button$")
	public void user_clicks_the_Simple_Alert_button() {
		// Click Simple Alert
		driver.findElement(By.cssSelector("#simple")).click();
	}

	@When("^User clicks the Prompt Alert button$")
	public void user_clicks_the_Prompt_Alert_button() {
		// Click Prompt Alert
		driver.findElement(By.cssSelector("#prompt")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void user_clicks_the_Confirm_Alert_button(){
		// Click Confirm Alert
		driver.findElement(By.cssSelector("#confirm")).click();
	}
	
	@Then("^Alert opens$")
	public void alert_opens() {
		// Switch
		alert = driver.switchTo().alert();
	}

	@And("^Read the text from it and print it$")
	public void read_the_text_from_it_and_print_it() {
		// Read Text
		System.out.println("Alert says: "+ alert.getText());
	}

	@And("^Write a custom message in it$")
	public void write_a_custom_message_in_it() {
		// Write custom message
		alert.sendKeys("Say hello to world!");
	}
	
	@And("^Close the alert$")
	public void close_the_alert() {
		// Accept alert
		alert.accept();		
	}
	
	@And("^Close the alert with Cancel$")
	public void close_the_alert_with_Cancel() {
		// Dismiss alert
		alert.dismiss();
	}
	
	@And("^Close Browser$")
	public void close_Browser() {
		driver.close();
	}
}
