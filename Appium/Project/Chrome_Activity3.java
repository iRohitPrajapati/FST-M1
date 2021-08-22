package appiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Chrome_Activity3 {
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	void beforeClass() throws MalformedURLException {
		DesiredCapabilities deCaps = new DesiredCapabilities();
		deCaps.setCapability("deviceName", "MobilePixel4Emu");
		deCaps.setCapability("platformName", "Android");
		deCaps.setCapability("automationName", "UiAutomator2");
		deCaps.setCapability("appPackage", "com.android.chrome");
		deCaps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		URL appServer = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, deCaps);
		wait = new WebDriverWait(driver, 15);
	}
	
	
	@Test
	void activity1() throws InterruptedException {
		driver.get("https://www.training-support.net/selenium");
		Thread.sleep(1000);
		try {
			MobileElement tnc = driver.findElementById("terms_accept");
			tnc.click();
			driver.findElementById("next_button").click();
			driver.findElementById("negative_button").click();
		}
		finally {
			// Wait
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Login']")));
			try {driver.findElementById("infobar_close_button").click();}catch(Exception e) {}
			// Scroll
			driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Popups\")")).click();
			
			// Invalid Credentials
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Sign In']"))).click();
			// User name & password
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("username"))).sendKeys("adm");
			driver.findElementById("password").sendKeys("pass");
			// Login
			driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
			Thread.sleep(1000);
			MobileElement errorMessage = driver.findElement(MobileBy.id("action-confirmation"));
			// Assertion
			Assert.assertEquals(errorMessage.getText(), "Invalid Credentials");
			
			// Valid Credentials
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Sign In']"))).click();
			// User name & password
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("username"))).sendKeys("admin");
			driver.findElementById("password").sendKeys("password");
			// Login
			driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
			Thread.sleep(1000);
			MobileElement successMessage = driver.findElement(MobileBy.id("action-confirmation"));
			// Assertion
			Assert.assertEquals(successMessage.getText(), "Welcome Back, admin");
		}
	}
	
	@AfterClass
	void afterClass() {
		driver.quit();
	}
}
