package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupsPage() {
       click(By.linkText("groups"));
    }

    public void gotoAddNew(){
        click(By.linkText("add new"));
    }
}
