package com.metronet.base;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

    @FindBy(id="username")
    WebElementFacade username;

    @FindBy(id="password")
    WebElementFacade password;

    @FindBy(xpath="//button[text()='Sign in']")
    WebElementFacade signIn;


}
