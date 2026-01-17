package com.preparationTestFramework.hybrid.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import java.time.Duration;

public class WaitUtils {
    public static void waitFor(WebDriver driver, ExpectedCondition<Boolean> condition, long seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(condition);
    }
}
