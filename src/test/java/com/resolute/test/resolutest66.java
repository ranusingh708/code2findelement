package com.resolute.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;


public class resolutest66 {

    public WebDriver driver;
@Before
    // Navigate to the home page
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = Paths.get("src/test/resources/QE-index.html").toUri().toString();
        driver.get(url);
        System.out.println(driver.getTitle());
    }

     String fetchCellValue(int row, int column){
        String cellXpath = String.format("//*[@id=\"test-6-div\"]/div/table/tbody/tr[%s]/td[%s]", row+1, column+1);
        WebElement cellWebElement = driver.findElement(By.xpath(cellXpath));
        String cellValue = cellWebElement.getText();
        return cellValue;

    }
    @Test
    public void verifycell(){
        Assert.assertEquals(fetchCellValue(2,  2), "Ventosanzap");
    }


}
