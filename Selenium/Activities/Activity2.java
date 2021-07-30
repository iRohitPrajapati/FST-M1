package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		// Get URL
		driver.get("https://www.training-support.net");
		
		// Get Title
		System.out.println(driver.getTitle());
		
		// Find Element
		System.out.println("Find by id: "+driver.findElement(By.id("about-link")).getText());
		System.out.println("Find by className: "+driver.findElement(By.className("green")).getText());
		System.out.println("Find by linkText: "+driver.findElement(By.linkText("About Us")).getText());
		System.out.println("Find by cssSelector: "+driver.findElement(By.cssSelector("#about-link")).getText());
		
		// Close
		driver.close();
	}

}
