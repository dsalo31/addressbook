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

    public void submitAddNewCreation() {
        click(By.name("submit"));
    }

}
