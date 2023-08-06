package com.runner;

import com.opencsv.exceptions.CsvValidationException;
import com.page.LoginPage;
import com.setup.SetupPage;
import org.junit.jupiter.api.Test;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

import static com.codeborne.selenide.Condition.*;

public class LoginPageTest extends SetupPage {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.usernameEnter.sendKeys("Admin");
        loginPage.passwordEnter.sendKeys("admin123");
        loginPage.submitButton.click();
        loginPage.dashboardLayout.exists();
        Thread.sleep(10000);
        loginPage.logoutScrollDownButton.click();
        Thread.sleep(2000);
        loginPage.logoutButton.click();
        Thread.sleep(7000);
        loginPage.loginPage.should(exist);
        Thread.sleep(2000);

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

    @Test
    public void loginWithEmptyUsername() throws InterruptedException{
        loginPage.usernameEnter.sendKeys("");
        loginPage.passwordEnter.sendKeys("admin1234");
        loginPage.submitButton.click();
        loginPage.requireMessage.exists();
        Thread.sleep(2000);
    }

    @Test
    public void loginWithEmptyPassword() throws InterruptedException{
        loginPage.usernameEnter.sendKeys("Admin");
        loginPage.passwordEnter.sendKeys("");
        loginPage.submitButton.click();
        loginPage.requireMessagePassword.exists();
        Thread.sleep(2000);
    }

    // Data-driven test using CSV file
    @Test
    public void testLoginWithCSVData() throws IOException, InterruptedException, CsvValidationException {
        String csvFile = "src/test/resources/testData.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] data;
        while ((data = reader.readNext()) != null) {
            String username = data[0];
            String password = data[1];

            loginPage.usernameEnter.sendKeys(username);
            loginPage.passwordEnter.sendKeys(password);
            loginPage.submitButton.click();
            Thread.sleep(2000);
        }
        reader.close();
    }
}
