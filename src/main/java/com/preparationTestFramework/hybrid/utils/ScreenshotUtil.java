package com.preparationTestFramework.hybrid.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver driver, String name) {
        try {
            byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Path p = Path.of("target", "screenshots", name + ".png");
            Files.createDirectories(p.getParent());
            Files.write(p, src);
            return p.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
