package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import static stepDefinitions.Activity1.driver;

public class Activity8 {
	WebElement fullName, email, subject, comment, send;
	@And("^Find the contact form fields$")
	public void find_the_contact_form_fields_Full_Name_email_etc() {
		// Get Full name
		fullName = driver.findElement(By.name("wpforms[fields][0]"));
		// Get email
		email = driver.findElement(By.name("wpforms[fields][1]"));
		// Get subject
		subject = driver.findElement(By.name("wpforms[fields][3]"));
		// Get comment
		comment = driver.findElement(By.name("wpforms[fields][2]"));
		// Get submit button
		send = driver.findElement(By.name("wpforms[submit]"));
	}

	@And("^Fill in the information and leave a message$")
	public void fill_in_the_information_and_leave_a_message() {
		// Set full name
		fullName.sendKeys("Ram Madhav");
		// Set email
		email.sendKeys("ram.madhav@rediffmail.com");
		// Set subject
		subject.sendKeys("Enquiry about a course");
		// Set comment
		comment.sendKeys("I want to know about blockchain course");
		// Leave message
		send.click();
	}

	@And("^Read and print the message after submission$")
	public void read_and_print_the_message_after_submission() throws InterruptedException {
		Thread.sleep(1000);
		String confirmMsg = driver.findElement(By.xpath("//div[contains(@class,'wpforms-confirmation-container')]/p")).getText();
		System.out.println("Confirmation message says: "+confirmMsg);
	}
	
}
