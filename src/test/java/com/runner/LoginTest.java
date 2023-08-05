package com.runner;

import com.page.LoginPage;
import com.setup.Setup;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends Setup {
    LoginPage loginPage;

    @Test
    public void doLogin()throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver); // No need to pass driver since Selenide handles it.

        loginPage.loginProcess("Admin", "admin123");

        Thread.sleep(5000);

        String actualUrl = driver().url(); // Use driver() method from Selenide to access the driver.
        String expectedUrl = "dashboard";
        assertTrue(actualUrl.contains(expectedUrl));
    }
}
