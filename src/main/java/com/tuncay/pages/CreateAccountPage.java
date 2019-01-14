package com.tuncay.pages;

import com.codeborne.selenide.SelenideElement;
import com.tuncay.common.Tusable;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class CreateAccountPage {

    private SelenideElement FIRSTNAME_TXT = $(By.id("firstName"));
    private SelenideElement LASTNAME_TXT = $(By.id("lastName"));
    private SelenideElement USERNAME_TXT = $(By.id("username"));
    private SelenideElement PASSWORD_TXT = $(By.xpath("//input[@name='Passwd']"));
    private SelenideElement CONFIRM_TXT = $(By.xpath("//input[@name='ConfirmPasswd']"));
    private SelenideElement ACC_DETAILS_NEXT_BTN = $(By.xpath("//div[@id='accountDetailsNext']//span[@class='RveJvd snByac']"));

    private String password = Tusable.randomStr(8);

    public void enterUsername(){
        String username = Tusable.getRandomUsername("cca.liamg");
        USERNAME_TXT.sendKeys(username);
        System.out.println(username);
    }

    public void enterUsername(String firstname){
        String username = Tusable.getRandomUsername(firstname);
        USERNAME_TXT.sendKeys(username);
        System.out.println(username);
    }

    public void enterFirstname() {
        String firstname = "Cimeyl";
        FIRSTNAME_TXT.sendKeys(firstname);
        System.out.println(firstname);
    }

    public void enterLastname(){
        String lastname = "Eeak";
        LASTNAME_TXT.sendKeys(lastname);
        System.out.println(lastname);
    }

    public void enterPassword(){
        PASSWORD_TXT.sendKeys(password);
        System.out.println(password);
    }

    public void enterConfirmTXT(){
        CONFIRM_TXT.sendKeys(password);
        System.out.println(password);
    }

    public void clickAccDetailsNextTXT(){
        ACC_DETAILS_NEXT_BTN.click();
        System.out.println("Account Details Next BTN is clicked.");
    }


}
