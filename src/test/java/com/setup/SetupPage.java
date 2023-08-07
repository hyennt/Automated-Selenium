package com.setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.open;

public class SetupPage {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    // Google Chrome Driver
//    @BeforeEach
//    public void setUp() {
//        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
//        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }

    //Microsoft Edge Driver
    @BeforeEach
    public void setUpEdge(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");

        Configuration.browserCapabilities = edgeOptions;
        Configuration.browser = "edge";

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // FireFox Driver
//    @BeforeEach
//    public void setUpFireFox(){
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("--some-firefox-specific-argument"); // Add any specific Firefox options here
//
//        Configuration.browserCapabilities = firefoxOptions;
//        Configuration.browser = "firefox";
//
//        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
}
