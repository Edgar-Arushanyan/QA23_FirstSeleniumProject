package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TenElementTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementsByCssTest() {

        driver.findElement(By.cssSelector("[href^='/computers']"));

        driver.findElement(By.cssSelector("[type='text']"));

        driver.findElement(By.cssSelector("[class='column my-account']"));





    }

}
