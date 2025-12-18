package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks extends BaseTest {

    @Before
    public void setUp() throws MalformedURLException {
        initializeDriver(); // driver is static → shared with Steps
    }

    @After
    public void tearDown() {
        quitDriver();
    }
}
