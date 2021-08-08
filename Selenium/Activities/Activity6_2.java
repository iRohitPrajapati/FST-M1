package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://training-support.net/selenium/ajax");

        //Find and click the button
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();

        By ajaxContent = By.id("ajax-content");
        //Wait for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(ajaxContent, "HELLO!"));

        //getText() and print
        String ajaxText = driver.findElement(ajaxContent).getText();
        System.out.println(ajaxText);
        
        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(ajaxContent, "I'm late!"));
        
        //Get late text and print it
        String lateText = driver.findElement(ajaxContent).getText();
        System.out.println(lateText);

        //Close browser
        driver.close();
    }
}
