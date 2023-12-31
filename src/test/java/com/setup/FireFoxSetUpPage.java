package com.setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.open;

public class FireFoxSetUpPage {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

     //FireFox Driver
    @BeforeEach
    public void setUpFireFox(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--some-firefox-specific-argument");

        Configuration.browserCapabilities = firefoxOptions;
        Configuration.browser = "firefox";

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
