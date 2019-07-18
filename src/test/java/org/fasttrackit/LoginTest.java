package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

   @Test

    public void validLoginTest() {

       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("http://fasttrackit.org/selenium-test/");
       WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
       accountButton.click();


}
}