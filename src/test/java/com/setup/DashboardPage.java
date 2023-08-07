package com.setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.page.LoginPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    // Google Chrome Driver
    @BeforeEach
    public void setUp() {
        LoginPage loginPage = new LoginPage();
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
