package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		// Get URL
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		// Get Title
		System.out.println("Main page title: "+driver.getTitle());
		
		// Find Element
		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
		
        firstName.sendKeys("Rohan");
        lastName.sendKeys("Mayur");
 
        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@test.com");
 
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("3464157642");
 
        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("Say hello to world");
 
        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        
		// Close
		driver.close();
	}
}
