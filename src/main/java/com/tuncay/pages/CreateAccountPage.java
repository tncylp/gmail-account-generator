package com.tuncay.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class CreateAccountPage {

    private SelenideElement FIRSTNAME_TXT = $(By.id("firstName"));
    private SelenideElement LASTNAME_TXT = $(By.id("lastName"));
    private SelenideElement USERNAME_TXT = $(By.id("username"));
    private SelenideElement PASSWORD_TXT = $(By.xpath("//input[@name='Passwd']"));
    private SelenideElement CONFIRM_BTN = $(By.xpath("//input[@name='ConfirmPasswd']"));
    private SelenideElement ACC_DETAILS_NEXT_BTN = $(By.xpath("//div[@id='accountDetailsNext']//span[@class='RveJvd snByac']"));
    
}
