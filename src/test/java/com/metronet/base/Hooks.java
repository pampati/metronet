package com.metronet.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseSteps {
    ConfigFileReader configFileReader;
    @Before
    public void setup(){
        configFileReader = new ConfigFileReader();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
