package ru.tests;// Generated by Selenium IDE

import org.junit.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.goToGroupsPage();
        app.selectGroup();
        app.getDelete();
        app.returnToGroupPage();
    }
}