package com.tuncay.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private SelenideElement createAccountBTN = $(By.xpath("//div[@class='gmail-nav__nav-links-wrap']/a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']"));

    public void clickCreateAccountBTN(){
        createAccountBTN.click();
    }
}
