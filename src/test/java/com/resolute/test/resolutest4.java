package com.resolute.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class resolutest4 {

    WebDriver driver;

    // Navigate to the home page
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\MyData\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Mudit/Downloads/QE-index.html");
        System.out.println(driver.getTitle());
    }

    @After
    public void afterExecution() {
        driver.quit();
    }

    @Test
    public void buttonenable() {

        // Assert button is enabled
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]"));
        assert button1.isEnabled();
    }

    @Test
    public void buttondisable() {

        // Assert password field is present and the second button is disabled
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]"));
        assert button2.isDisplayed();

    }
}