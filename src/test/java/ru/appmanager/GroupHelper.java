package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.model.GroupData;

public class GroupHelper {
    public WebDriver driver;


    public GroupHelper(WebDriver driver) {
        this.driver = driver;
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

    public void getDelete() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
