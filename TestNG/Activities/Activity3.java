package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get(" https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void test1() {
        // Set Username
    	driver.findElement(By.id("username")).sendKeys("admin");
    	// Set password
    	driver.findElement(By.id("password")).sendKeys("password");
    	// Login
    	driver.findElement(By.xpath("//button[text()='Log in']")).click();
    	
    	// Read Message
    	String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
    	Assert.assertEquals("Welcome Back, admin", loginMsg);
    }
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
