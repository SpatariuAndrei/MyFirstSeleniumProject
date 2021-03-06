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
      WebElement loginLink = driver.findElement (By.cssSelector("#header-account > div > ul > li.last > a"));
      loginLink.click();
      driver.findElement(By.cssSelector("#email")).sendKeys("spatariuandrei@yahoo.com");
       driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
       driver.findElement(By.cssSelector("#send2")).click();
      driver.quit();
   }

       @Test

       public void negativeTestLogin() {

           System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
           WebDriver driver = new ChromeDriver();
           driver.get("http://fasttrackit.org/selenium-test/");
           WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
           accountButton.click();
           WebElement loginLink = driver.findElement (By.cssSelector("#header-account > div > ul > li.last > a"));
           loginLink.click();
           driver.findElement(By.cssSelector("#email")).sendKeys("spatariuandrei@yahoo.com");
           driver.findElement(By.cssSelector("#pass")).sendKeys("222");
           driver.findElement(By.cssSelector("#send2")).click();
           driver.quit();




}
}