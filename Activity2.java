package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Activity2 {
	String header;
	Activity1 act = new Activity1();
	
	@SuppressWarnings("static-access")
	@When("^Get webpage header$")
	public void get_webpage_header() {
		// Get header
		header = act.driver.findElement(By.tagName("h1")).getText();
		System.out.println("Header: "+header);
	}

	@And("^Verify result is \"([^\"]*)\"$")
	public void verify_result_is(String arg1) {
		// Verify if Header is exactly same
		assertEquals(arg1, header);
	}
}
