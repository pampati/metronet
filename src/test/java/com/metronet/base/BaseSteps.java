package com.metronet.base;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class BaseSteps extends ScenarioSteps {
    @Page
    BasePage basePage;

    @Managed
    WebDriver driver;

    ConfigFileReader configFileReader = new ConfigFileReader();
    public void launchUrl() {
        driver =getDriver();
        driver.get(configFileReader.getApplicationUrl());
    }

    public void login() {
        basePage.username.sendKeys(configFileReader.getUsername());
        basePage.password.sendKeys(configFileReader.getPassword());
        basePage.signIn.click();
    }
}
