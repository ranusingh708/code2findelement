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


public class resolutest1 {

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
    public void testEmailInputPresentOnLoginPage() {

        // Assert email field is present
        WebElement emailAddress = driver.findElement(By.id("inputEmail"));
        Assert.assertTrue(emailAddress.isDisplayed());
    }

    @Test
    public void testPasswordInputPresentOnLoginPage() {

        // Assert password field is present
        WebElement password = driver.findElement(By.id("inputPassword"));
        Assert.assertTrue(password.isDisplayed());
    }

    @Test
    public void testSignInButtonPresentOnLoginPage() {

        // Assert sign in tab is present
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        Assert.assertTrue(login.isDisplayed());
    }

    @Test
    public void enteremailandpassword() {
        WebElement emailAddress = driver.findElement(By.id("inputEmail"));
        emailAddress.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("jobsearch");
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }

}

