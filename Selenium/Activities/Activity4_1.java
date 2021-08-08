package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		// Get URL
		driver.get("https://www.training-support.net");
		
		// Get Title
		System.out.println("Main page title:"+driver.getTitle());
		
		// Find Element
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		// Get Title
		System.out.println("Title of new page:"+driver.getTitle());
		
		// Close
		driver.close();
	}
}
