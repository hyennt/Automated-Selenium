package com.runner;

import com.codeborne.selenide.Condition;
import com.page.PimPage;
import com.setup.ChromeSetUpPage;
import org.junit.jupiter.api.Test;

public class PimPageTest extends ChromeSetUpPage {
    LoginPageTestEdge loginPageTest = new LoginPageTestEdge();
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
    public void AddEmptyFieldParam() throws InterruptedException{
        loginPageTest.login();
        pimPage.pimButton.click();
        pimPage.addButton.click();
        pimPage.firsNameField.sendKeys("");
        pimPage.middleNameField.sendKeys("Thuy");
        pimPage.lastNameField.sendKeys("");
        pimPage.saveButton.click();

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
//        pimPage.personalDetail.should(Condition.exist);
       // pimPage.redirectUserPage.should(Condition.exist);
        Thread.sleep(5000);
    }
}
