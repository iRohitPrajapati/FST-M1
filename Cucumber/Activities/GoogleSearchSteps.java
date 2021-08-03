package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void googleHome() {
		// Instantiate FireFox driver
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		// Open browser
		driver.get("https://www.google.com");
	}
	
	@When("^User types in Cheese and hits ENTER$")
	public void searchGoogleEngine() {
		driver.findElement(By.name("q")).sendKeys("Cheese"+Keys.ENTER);
	}
	
	@Then("^Show how many search results were shown$")
	public void ss() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
	}
	
	@And("^Close the browser$")
	public void closeBrowser() {
		driver.close();
	}
}
