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

public class Chrome_Activity1 {
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
			// Scroll
			driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"To-Do List\")")).click();
			
			// Add tasks
			wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("taskInput")));
			String tasks[] = {"Add tasks to list","Get number of tasks","Clear the list"};
			for(String item: tasks)
				addTasks(item);
			// Strike task
			for(String item: tasks)
				driver.findElementByXPath("//android.view.View[@text='"+item+"']").click();
			// Clear the list
			driver.findElementByXPath("//android.view.View[@text='Clear List']").click();
			// Assertion
			MobileElement task = driver.findElementByXPath("//android.view.View[@text='"+tasks[0]+"']");
			Assert.assertTrue(task.isDisplayed(), "All tasks are Cleared");
		}
	}
	
	@AfterClass
	void afterClass() {
		driver.quit();
	}
	
	void addTasks(String taskName) {
		driver.findElementById("taskInput").sendKeys(taskName);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@text='Add Task']")).click();
	}
}
