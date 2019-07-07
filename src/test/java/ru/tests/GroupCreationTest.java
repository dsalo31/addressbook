package ru.tests;// Generated by Selenium IDE

import org.junit.Test;
import ru.model.GroupData;

public class sGroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillFormGroup(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation("submit");
        app.returnToGroupPage();
    }

}