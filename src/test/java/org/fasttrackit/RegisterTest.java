package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

@Test

public void RegisterTest() {

    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

    WebDriver driver = new ChromeDriver();

    driver.get("http://fasttrackit.org/selenium-test/");

    WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
    accountButton.click();

    WebElement registerButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
    registerButton.click();

    driver.findElement(By.cssSelector("#firstname")).sendKeys("Spatariu");

    driver.findElement(By.cssSelector("#middlename")).sendKeys("Sebastian");
    driver.findElement(By.cssSelector("#lastname")).sendKeys("Andrei");
    driver.findElement(By.cssSelector("#email_address")).sendKeys("spatariuandrei@yahoo.com");
    driver.findElement(By.cssSelector("#password")).sendKeys("1234");
    driver.findElement(By.cssSelector("#confirmation")).sendKeys("1234");
    driver.findElement(By.cssSelector("#is_subscribed")).click();



}
}