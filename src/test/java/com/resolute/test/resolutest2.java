package com.resolute.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class resolutest2 {

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
    public void testThreeValues() {

        // In the test 2 div assert that there are three values in the listgroup
        List<WebElement> listgroup = driver.findElements(By.xpath("//div[@id='test-2-div']/ul/li"));
        Assert.assertEquals(listgroup.size(), 3);

    }
    @Test
    public void secondListItem() {

        // Assert that the second list item's value is set to "List Item 2"
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        WebElement secondListItem = driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]"));
        String secondListItemText=(String)javascriptExecutor.executeScript("return arguments[0].firstChild.textContent", secondListItem);
        secondListItemText = secondListItemText.trim();

    }
    @Test
    public void element6() {

        //Assert.assertEquals(secondListItem.getText(), "List Item 2");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]/span"));
        String text6 = element6.getText();

    }

}


