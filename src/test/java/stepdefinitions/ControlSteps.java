////package stepdefinitions;
////
////import base.BaseTest;
////import io.appium.java_client.AppiumBy;
////import io.cucumber.java.en.*;
////import org.openqa.selenium.By;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
////
////import java.time.Duration;
////
////import static org.testng.Assert.assertTrue;
////
////public class ControlSteps extends BaseTest {
////
////    WebDriverWait wait;
////
////    @Given("the user launches the ApiDemos application")
////    public void the_user_launches_the_apidemos_application() {
////        // driver initialized in Hooks
////        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////    }
////
////    @When("the user navigates to Views")
////    public void the_user_navigates_to_views() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                AppiumBy.accessibilityId("Views"))).click();
////    }
////
////    @And("the user opens Controls")
////    public void the_user_opens_controls() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                AppiumBy.accessibilityId("Controls"))).click();
////    }
////
////    // -------------------- Theme Selection --------------------
////
////    @And("the user selects Light Theme")
////    public void the_user_selects_light_theme() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                AppiumBy.accessibilityId("1. Light Theme"))).click();
////    }
////
////    @And("the user selects Dark Theme")
////    public void the_user_selects_dark_theme() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                AppiumBy.accessibilityId("2. Dark Theme"))).click();
////    }
////
////    // -------------------- Validation --------------------
////
////    @Then("the Controls Light Theme screen should be displayed")
////    public void the_controls_light_theme_screen_should_be_displayed() {
////        boolean isDisplayed = wait.until(
////                ExpectedConditions.visibilityOfElementLocated(
////                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
////        assertTrue(isDisplayed, "Controls Light Theme screen is NOT displayed");
////    }
////
////    @Then("the Controls Dark Theme screen should be displayed")
////    public void the_controls_dark_theme_screen_should_be_displayed() {
////        boolean isDisplayed = wait.until(
////                ExpectedConditions.visibilityOfElementLocated(
////                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
////        assertTrue(isDisplayed, "Controls Dark Theme screen is NOT displayed");
////    }
////
////    // -------------------- Common Input Steps --------------------
////
////    @And("the user enters text in the input field")
////    public void the_user_enters_text_in_the_input_field() {
////        wait.until(ExpectedConditions.visibilityOfElementLocated(
////                By.id("io.appium.android.apis:id/edit")))
////                .sendKeys("Hello Appium");
////    }
////
////    @And("the user selects a checkbox")
////    public void the_user_selects_a_checkbox() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.id("io.appium.android.apis:id/check1"))).click();
////    }
////
////    @And("the user selects a radio button")
////    public void the_user_selects_a_radio_button() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.id("io.appium.android.apis:id/radio1"))).click();
////    }
////
////    @And("the user selects an option from the dropdown")
////    public void the_user_selects_an_option_from_the_dropdown() {
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.id("io.appium.android.apis:id/spinner1"))).click();
////
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.xpath("//android.widget.CheckedTextView[@text='Earth']"))).click();
////    }
////}
//
//
//
//
package stepdefinitions;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.*;
import utils.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ControlSteps extends BaseTest {

    WebDriverWait wait;

    @Given("the user launches the ApiDemos application")
    public void the_user_launches_the_apidemos_application() {
        // driver initialized in Hooks
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // -------------------- Controls Scenarios --------------------

    @When("the user navigates to Views")
    public void the_user_navigates_to_views() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Views"))).click();
    }

    @And("the user opens Controls")
    public void the_user_opens_controls() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Controls"))).click();
    }

    @And("the user selects Light Theme")
    public void the_user_selects_light_theme() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("1. Light Theme"))).click();
    }

    @And("the user selects Dark Theme")
    public void the_user_selects_dark_theme() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("2. Dark Theme"))).click();
    }

    @Then("the Controls Light Theme screen should be displayed")
    public void the_controls_light_theme_screen_should_be_displayed() {
        boolean isDisplayed = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
        assertTrue(isDisplayed, "Controls Light Theme screen is NOT displayed");
    }

    @Then("the Controls Dark Theme screen should be displayed")
    public void the_controls_dark_theme_screen_should_be_displayed() {
        boolean isDisplayed = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
        assertTrue(isDisplayed, "Controls Dark Theme screen is NOT displayed");
    }

    @And("the user enters text in the input field")
    public void the_user_enters_text_in_the_input_field() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("io.appium.android.apis:id/edit"))).sendKeys("Hello Appium");
    }

    @And("the user selects a checkbox")
    public void the_user_selects_a_checkbox() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/check1"))).click();
    }

    @And("the user selects a radio button")
    public void the_user_selects_a_radio_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/radio1"))).click();
    }

    @And("the user selects an option from the dropdown")
    public void the_user_selects_an_option_from_the_dropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/spinner1"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.CheckedTextView[@text='Earth']"))).click();
    }

    // -------------------- Animation / Multiple Properties --------------------

    @When("the user opens Animation")
    public void the_user_opens_animation() {
        // Animation is directly on main screen
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Animation"))).click();
    }

    @And("the user selects {string}")
    public void the_user_selects_animation_option(String option) {
        // Scroll to the option and click
        WebElement animationOption = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + option + "\"));"));
        animationOption.click();
    }

    @Then("the Multiple Properties screen should be displayed")
    public void the_multiple_properties_screen_should_be_displayed() {
        // Wait for the correct activity to load
        wait.until(driver -> ((io.appium.java_client.android.AndroidDriver) driver)
                .currentActivity().equals(".animation.MultiPropertyAnimation"));

        // Wait for Run button to be clickable
        WebElement runButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("io.appium.android.apis:id/startButton")));
        assertTrue(runButton.isDisplayed(), "Multiple Properties screen is NOT displayed");
    }

    @And("the user performs the animation")
    public void the_user_performs_the_animation() {
        // Wait for the Run button
        WebElement runButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("io.appium.android.apis:id/startButton")));
        runButton.click();

        // Optional: wait for animation to complete
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
    @When("the user opens Graphics")
    public void the_user_opens_graphics() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Graphics"))).click();
    }
    @And("the user opens Arcs")
    public void the_user_opens_arcs() {
        WebElement arcs = driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Arcs\"));"));
        arcs.click();
    }
    @Then("the Arcs screen should be displayed")
    public void the_arcs_screen_should_be_displayed() {
        WaitUtils.waitForActivity(driver, ".graphics.Arcs", 10);
    }



}

