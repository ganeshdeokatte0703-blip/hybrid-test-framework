package com.preparationTestFramework.hybrid.stepdefinitions;

import com.preparationTestFramework.hybrid.driver.DriverFactory;
import com.preparationTestFramework.hybrid.pages.HomePage;
import io.cucumber.java.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;
import java.time.Instant;

public class HomeSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("I open the homepage")
    public void i_open_the_homepage() {
        homePage.open(System.getProperty("base.url",
                "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=792658641744&hvpos=&hvnetw=g&hvrand=14242468058503709294&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300140&hvtargid=kwd-29089120&hydadcr=5496_2422933&gad_source=1"));
    }

    @When("I search for cucumber")
    public void iSearchForCucumber() {

        WebDriver driver = DriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
        );

        searchBox.sendKeys("iphone 17 pro");
        searchBox.sendKeys(Keys.ENTER);
    }
    //added line

    @Then("the results page should show results")
    public void theResultsPageShouldShowResults() {
        WebDriver driver = DriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='_ZGFyZ_truncatedText_1t3Nx']"))));

        String priceValue = driver.findElement(By.xpath("//span[@class='_ZGFyZ_truncatedText_1t3Nx']")).getText();

        Assert.assertTrue(
                priceValue.contains("iPhone 17 Pro"),
                "Expected value and value is: " + priceValue
        );

    }

}
