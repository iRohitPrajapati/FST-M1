package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import static stepDefinitions.Activity1.driver;

import java.util.List;

public class Activity7 {
	@And("^Find all cources on the page and print$")
	public void Find_all_cources_on_the_page_and_print() {
		// Get courses
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='caption']/h3"));
		System.out.println("First info box title: "+elements.size());
	}
}
