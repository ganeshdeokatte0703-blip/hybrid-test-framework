package com.preparationTestFramework.hybrid.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.preparationTestFramework.hybrid.stepdefinitions", "com.preparationTestFramework.hybrid.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestNGRunnerForCucumber extends AbstractTestNGCucumberTests {
}
