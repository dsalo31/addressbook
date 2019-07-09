package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.model.AddNewData;

public class AddNewHelper extends HelperBase{

    public AddNewHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFormAddNew(AddNewData addNewData){
        type(By.name("firstname") , addNewData.getFirstname());
        type(By.name("lastname") , addNewData.getLastname());
        type(By.name("nickname") , addNewData.getNickname());
        //file(By.xpath("/html/body/div/div[4]/form/input[7]") , addNewData.getPhoto());
    }

    public void loadPhoto(){
        click(By.name("photo"));
        driver.findElement(By.name("photo")).sendKeys("D:\\IT\\Java\\addressbook\\addressbook\\ScreenSelector.bmp");
//        type(By.name("D:\\IT\\Java\\addressbook\\addressbook\\ScreenSelector.bmp"));

    }

    public void submitAddNewCreation() {
        click(By.name("submit"));
    }

}
