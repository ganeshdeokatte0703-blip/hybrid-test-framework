# Hybrid Selenium Java TestNG Cucumber (POM)

Base package: `com.preparationTestFramework.hybrid`

This is a starter Maven project ready to import into IntelliJ IDEA.
- Java 17
- Selenium + WebDriverManager (Chrome)
- TestNG + Cucumber (TestNG runner)
- Page Object Model pattern
- Basic Cucumber HTML reporting enabled
- Allure dependencies/configuration are included but commented out for easy activation later

## How to open in IntelliJ
1. File -> Open -> select the project folder `hybrid-test-framework`
2. Let IntelliJ import Maven project
3. Run `com.preparationTestFramework.hybrid.runners.TestNGRunnerForCucumber` as TestNG

## Run from CLI
```
mvn test -Dtest=com.preparationTestFramework.hybrid.runners.TestNGRunnerForCucumber -Dbrowser=chrome
```
