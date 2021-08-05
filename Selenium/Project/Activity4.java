package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class Activity4 {
	Activity1 act1 = new Activity1();
	
	@SuppressWarnings("static-access")
	@When("^User get (\\d+) popular course and verify result is \"([^\"]*)\"$")
	public void get_info_box_title_and_verify_result_is(int arg1, String arg2) {
		// Get info box title
		List<WebElement> elements = act1.driver.findElements(By.xpath("//div[@class='caption']/h3"));
		String popularCourse = elements.get(arg1-1).getText();
		System.out.println("2nd Most Popular Course: "+popularCourse);
		// Verify Title
		assertEquals(arg2, popularCourse);
	}
}
