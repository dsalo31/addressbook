package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    public WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void type(String locator, String text) {
        click(By.id(locator));
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
