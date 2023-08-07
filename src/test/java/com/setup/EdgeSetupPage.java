package com.setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.edge.EdgeOptions;

import static com.codeborne.selenide.Selenide.open;

public class EdgeSetupPage {
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    //Microsoft Edge Driver
    @BeforeEach
    public void setUpEdge(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");

        Configuration.browserCapabilities = edgeOptions;
        Configuration.browser = "edge";

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


}
