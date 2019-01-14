package com.tuncay.trials;

import com.codeborne.selenide.Configuration;
import com.tuncay.pages.CreateAccountPage;
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
        CreateAccountPage createAccountPage = new CreateAccountPage();

        homePage.openHomePage();
        homePage.clickCreateAccountBTN();

        createAccountPage.enterFirstname();
        createAccountPage.enterLastname();
        createAccountPage.enterUsername();
        createAccountPage.enterPassword();
        createAccountPage.enterConfirmTXT();
        createAccountPage.clickAccDetailsNextTXT();

        // cca.liamg
    }
}
