package com.preparationTestFramework.hybrid.config;

import java.util.Properties;

public class ConfigManager {
    private static final Properties props = new Properties();

    static {
        // load default props or from file if you want
        props.setProperty("base.url", "https://www.google.com");
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
