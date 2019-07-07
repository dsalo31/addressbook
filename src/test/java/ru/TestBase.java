package ru;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    JavascriptExecutor js;
    protected WebDriver driver;
    protected Map<String, Object> vars;

    @Before
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\Java\\addressbook\\addressbook\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/addressbook/");
        login("admin", "secret");
    }

    protected void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    protected void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    protected void fillFormGroup(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());

    }

    protected void submitGroupCreation(String submit) {
        driver.findElement(By.name(submit)).click();
    }

    protected void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    protected void goToGroupsPage() {
        By.linkText("groups").findElement(driver).click();
    }

    public void getDelete() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
