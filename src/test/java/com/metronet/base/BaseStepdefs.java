package com.metronet.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class BaseStepdefs {

    @Steps
    BaseSteps baseSteps;

    @Managed
    WebDriver driver;

    @Given("user launches application")
    public void userLaunchesApplication() {
        baseSteps.launchUrl();
    }

    @When("enters valid credentials")
    public void entersValidCredentials() {
        baseSteps.login();
    }

    @Then("user navigated to homepage")
    public void userNavigatedToHomepage() {
    }
}
