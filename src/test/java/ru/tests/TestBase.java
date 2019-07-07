package ru.tests;

import org.junit.After;
import org.junit.Before;
import ru.appmanager.ApplicationManager;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
