package ru.auto.testing.core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class SimpleElement extends RemoteWebElement {

    @Override
    public void click(){
        this.click();
    }
}
