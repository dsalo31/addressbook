package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.model.GroupData;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\Java\\addressbook\\addressbook\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public void stop() {
        driver.quit();
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void fillFormGroup(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());

    }

    public void submitGroupCreation(String submit) {
        driver.findElement(By.name(submit)).click();
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void goToGroupsPage() {
        By.linkText("groups").findElement(driver).click();
    }

    public void getDelete() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
