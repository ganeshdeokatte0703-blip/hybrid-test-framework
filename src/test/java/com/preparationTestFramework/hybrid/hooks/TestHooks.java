package com.preparationTestFramework.hybrid.hooks;

import com.preparationTestFramework.hybrid.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {
    @Before
    public void beforeScenario() {
        String browser = System.getProperty("browser", "chrome");
        DriverFactory.initDriver(browser);
    }

    @After
    public void afterScenario() {
        DriverFactory.quitDriver();
    }
}
