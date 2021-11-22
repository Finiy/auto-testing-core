package ru.auto.testing.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass {

    private ChromeDriver chromeDriver;

    public TestingClass(ChromeDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public void testNumberOne(){
        chromeDriver.get("https://google.com");
        WebElement element = chromeDriver.findElement(By.name("q"));
        element.sendKeys("fuzz");
        element.submit();
        chromeDriver.close();
    }
}
