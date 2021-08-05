package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity5 {
	Activity1 act1 = new Activity1();
	
	@SuppressWarnings("static-access")
	@When("^User locates \"([^\"]*)\" item in navigation bar and click$")
	public void user_locates_item_in_navigation_bar_and_click(String arg1) {
		// Find navigation bar
		WebElement navigation = act1.driver.findElement(By.id("site-navigation"));
		// Get Items in navigation list
		navigation.findElement(By.linkText(arg1)).click();
	}
	
	@Then("^Get page title and verify \"(.*)\"$")
	public void get_page_title_and_verify(String arg1) {
		if(act1.get_page_title().contains(arg1)) 
			System.out.println("User Lands to Correct Page");
		else 
			System.out.println("User Lands to Incorrect Page");
	}
}
