package com.resolute.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class resolutest3 {

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
    public void dropdownOption() {

        // Find the dropdown element and click
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        // Find the "Option 3" element in the dropdown menu and select option 3 and click
        WebElement option3 = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[text()='Option 3']"));
        option3.click();
    }


    @Test
    public void dropdowndefault() {

        // Find the dropdown menu element is default as option 1
        WebElement dropdownMenu = driver.findElement(By.cssSelector("button.btn-secondary.dropdown-toggle"));
        Assert.assertEquals(dropdownMenu.getText(), "Option 1");
    }
}



