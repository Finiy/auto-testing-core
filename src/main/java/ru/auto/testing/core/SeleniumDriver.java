package ru.auto.testing.core;

import javafx.util.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class SeleniumDriver {

    private ChromeDriver webDriver;

    public SeleniumDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\auto-testing-core\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public void executeTests(){
        TestingClass testingClass = new TestingClass(webDriver);
        testingClass.testNumberOne();
    }

}
