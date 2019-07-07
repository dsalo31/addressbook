package ru.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;
    private  SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    public Map<String, Object> vars;
    JavascriptExecutor js;


    public void init() {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\Java\\addressbook\\addressbook\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
