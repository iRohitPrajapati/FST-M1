package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import static stepDefinitions.Activity1.driver;

import java.util.List;
import java.util.NoSuchElementException;

public class Activity9 {
	Activity6 activity6 = new Activity6();
	
	@And("^Select any course and open it$")
	public void select_any_course_and_open_it() {
		// Get courses
		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='See more...']"));
		// Select 1st course
		elements.get(0).click();
	}

	@And("^Login with username \"(.*)\" and password \"(.*)\" to verify progress$")
	public void login_to_verify_progress(String username, String password) {
		// Login to Enroll
		driver.findElement(By.xpath("//a[text()='Login to Enroll']")).click();
		// Login
		activity6.user_enters_username_and_password(username, password);
		// Click login
		activity6.click_login_button_to_login();
	}

	@And("^If status is not complete, mark it complete$")
	public void if_status_is_not_complete_mark_it_complete() {
		try {
			WebElement status = driver.findElement(By.xpath("//div[text()='100% Complete']"));
			status.click();
			System.out.println("Course is already 100% complete");
		} catch (NoSuchElementException nse) {
			WebElement markComplete = driver.findElement(By.xpath("//button[contains(text()='Mark Complete')]"));
			markComplete.click();
		}
	}
}
