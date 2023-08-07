package com.runner;

import com.page.PimPage;
import com.setup.DashboardPage;
import org.junit.jupiter.api.Test;

public class PimPageTest extends DashboardPage {
    LoginPageTest loginPageTest = new LoginPageTest();
    PimPage pimPage = new PimPage();
    @Test
    public void AddEmployee() throws InterruptedException{
        loginPageTest.login();
        pimPage.pimButton.click();
        pimPage.addButton.click();
        Thread.sleep(5000);
        pimPage.firsNameField.sendKeys("Tina");
        pimPage.middleNameField.sendKeys("Thuy");
        pimPage.lastNameField.sendKeys("Nguyen");
        //pimPage.employeeIDField.sendKeys("0462");
        pimPage.saveButton.click();
        Thread.sleep(10000);


    }
}
