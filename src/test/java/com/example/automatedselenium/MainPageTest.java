package com.example.automatedselenium;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        //open("https://www.jetbrains.com/");
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void login() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("Admin");
        loginPage.passwordEnter.sendKeys("admin123");
        loginPage.submitButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void loginFailed() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("yen");
        loginPage.passwordEnter.sendKeys("admin123");
        loginPage.submitButton.click();
        loginPage.usernameEnter.shouldNotHave(attribute("value","Admin"));
        loginPage.loginErrorMessage.should(exactText("Invalid credentials"));
        Thread.sleep(2000);
    }



    @Test
    public void search() {
        mainPage.searchButton.click();

        $("[data-test='search-input']").sendKeys("Selenium");
        $("button[data-test='full-search-button']").click();

        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }

    @Test
    public void navigationToAllTools() {
        mainPage.seeDeveloperToolsButton.click();
        mainPage.findYourToolsButton.click();

        $("#products-page").shouldBe(visible);

        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title());
    }
}
