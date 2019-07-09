package ru.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import ru.appmanager.ApplicationManager;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
