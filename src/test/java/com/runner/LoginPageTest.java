package com.runner;

import com.page.LoginPage;
import com.setup.SetupPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;

public class LoginPageTest extends SetupPage {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("Admin");
        loginPage.passwordEnter.sendKeys("admin123");
        loginPage.submitButton.click();
        loginPage.dashboardLayout.exists();
        Thread.sleep(10000);
    }

    @Test
            // Enter incorrect username
    public void loginFailedWithUsername() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("yen");
        loginPage.passwordEnter.sendKeys("admin123");
        loginPage.submitButton.click();
        loginPage.usernameEnter.shouldNotHave(attribute("value","Admin"));
        loginPage.loginErrorMessage.should(exactText("Invalid credentials"));
        Thread.sleep(2000);
    }

    @Test
    // Enter incorrect password
    public void loginFailedWithPassword() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("Admin");
        loginPage.passwordEnter.sendKeys("admin1234");
        loginPage.submitButton.click();
        loginPage.passwordEnter.shouldNotHave(attribute("value","admin123"));
        loginPage.loginErrorMessage.should(exactText("Invalid credentials"));
        Thread.sleep(2000);
    }
}
