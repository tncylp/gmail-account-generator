package com.tuncay.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage {

    private SelenideElement createAccountBTN = $(By.xpath("//div[@class='daaWTb']//span[@class='RveJvd snByac']"));


    public void openHomePage(){
        open("https://accounts.google.com/");
    }

    public void clickCreateAccountBTN(){
        createAccountBTN.click();

    }
}
