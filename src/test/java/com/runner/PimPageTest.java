package com.runner;

import com.codeborne.selenide.Condition;
import com.page.PimPage;
import com.setup.ChromeSetUpPage;
import org.junit.jupiter.api.Test;

public class PimPageTest extends ChromeSetUpPage {
    LoginPageTest loginPageTest = new LoginPageTest();
    PimPage pimPage = new PimPage();
    @Test
    public void AddEmptyFieldEmployee() throws InterruptedException {
            loginPageTest.login();
            pimPage.pimButton.click();
            pimPage.addButton.click();
            Thread.sleep(5000);
            pimPage.firsNameField.sendKeys("");
            pimPage.middleNameField.sendKeys("middleName");
            pimPage.lastNameField.sendKeys("");
            pimPage.saveButton.click();
            pimPage.requireMessgage.should(Condition.exist);
            pimPage.redirectUserPage.shouldNot(Condition.exist);
            Thread.sleep(5000);
    }

    @Test
    public void AddEmptyFirstNameEmployee() throws InterruptedException{
        loginPageTest.login();
        pimPage.pimButton.click();
        pimPage.addButton.click();
        pimPage.firsNameField.sendKeys("");
        pimPage.middleNameField.sendKeys("Thuy");
        pimPage.lastNameField.sendKeys("Ng");
        pimPage.saveButton.click();
        pimPage.requireMessgage.should(Condition.exist);
        pimPage.redirectUserPage.shouldNot(Condition.exist);
        Thread.sleep(5000);
    }

    @Test
    public void AddFullFieldEmployee() throws InterruptedException{
        loginPageTest.login();
        pimPage.pimButton.click();
        pimPage.addButton.click();
        Thread.sleep(5000);
        pimPage.firsNameField.sendKeys("Tiana");
        pimPage.middleNameField.sendKeys("middleName");
        pimPage.lastNameField.sendKeys("Nguyen");
        pimPage.saveButton.click();
        pimPage.userPage.should(Condition.exist);
        Thread.sleep(10000);
    }
}
