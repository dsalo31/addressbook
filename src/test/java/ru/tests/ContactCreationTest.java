package ru.tests;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import ru.model.AddNewData;

import java.util.*;
public class ContactCreationTest extends TestBase{

  @Test
  public void contactCreationTest() {

    app.getNavigationHelper().gotoAddNew();
    app.getAddNewHelper().fillFormAddNew(new AddNewData("Tester1", "Tester2", "Tester3" ));
    app.getAddNewHelper().submitAddNewCreation();
//    driver.findElement(By.name("bday")).click();
//    {
//      WebElement dropdown = driver.findElement(By.name("bday"));
//      dropdown.findElement(By.xpath("//option[. = '31']")).click();
//    }
//    driver.findElement(By.cssSelector("select:nth-child(61) > option:nth-child(33)")).click();
//    driver.findElement(By.name("bmonth")).click();
//    {
//      WebElement dropdown = driver.findElement(By.name("bmonth"));
//      dropdown.findElement(By.xpath("//option[. = 'July']")).click();
//    }
//    driver.findElement(By.cssSelector("select:nth-child(62) > option:nth-child(8)")).click();
//    driver.findElement(By.name("byear")).click();
//    driver.findElement(By.name("byear")).sendKeys("1987");
//    driver.findElement(By.name("new_group")).click();
//    {
//      WebElement dropdown = driver.findElement(By.name("new_group"));
//      dropdown.findElement(By.xpath("//option[. = 'test1']")).click();
//    }
    //driver.findElement(By.cssSelector("select:nth-child(71) > option:nth-child(2)")).click();

  }

}
