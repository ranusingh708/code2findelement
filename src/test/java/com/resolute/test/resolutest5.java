package com.resolute.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class resolutest5 {

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
    public void test5button() {

        //Wait for a button to be displayed (note: the delay is random) and then click it
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement test5button = wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"test5-button\"]")));
        test5button.click();

        //assert that a success message is displayed and button is now disabled
        WebElement Test5Alert = driver.findElement(By.xpath("//*[@id=\"test5-alert\"]"));
        Assert.assertTrue(Test5Alert.isDisplayed());
        Assert.assertEquals(Test5Alert.getText(),"You clicked a button!");
        Assert.assertFalse(test5button.isEnabled());

    }
}