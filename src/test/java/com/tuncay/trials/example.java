package com.tuncay.trials;

import com.codeborne.selenide.Configuration;
import com.tuncay.pages.HomePage;
import org.openqa.selenium.*;
import org.junit.*;
import static com.codeborne.selenide.Selenide.*;

public class example {

    @Before
    public void setBrowserConfigurations(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");

    }

    @Test
    public void goToGmailDotCom(){
        HomePage homePage = new HomePage();

        homePage.openHomePage();
        homePage.clickCreateAccountBTN();

        // cca.liamg
    }
}
