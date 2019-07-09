package ru.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;
    private  SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private AddNewHelper addNewHelper;
    public Map<String, Object> vars;
    JavascriptExecutor js;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\Java\\addressbook\\addressbook\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\IT\\Java\\addressbook\\addressbook\\drivers\\chromedriver.exe");
        if(browser == BrowserType.FIREFOX){
            driver = new FirefoxDriver();
        }else if(browser == BrowserType.CHROME){
            driver = new ChromeDriver();
        }
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/addressbook/");
        groupHelper = new GroupHelper(driver);
        addNewHelper = new AddNewHelper(driver);
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
    public AddNewHelper getAddNewHelper() { return addNewHelper; }
}
