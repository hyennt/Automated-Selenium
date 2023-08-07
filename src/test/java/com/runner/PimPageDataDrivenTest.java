package com.runner;

import com.codeborne.selenide.Condition;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.page.PimPage;
import com.setup.ChromeSetUpPage;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class PimPageDataDrivenTest extends ChromeSetUpPage {
    LoginPageTestEdge loginPageTest = new LoginPageTestEdge();
    PimPage pimPage = new PimPage();
    PimPageTest pimPageTest = new PimPageTest();
    @Test
    public void PimPageTestCSVDataTest() throws InterruptedException, IOException, CsvValidationException {
        String csvFile = "src/test/resources/testPIMData.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] data;
        while ((data = reader.readNext()) != null) {
            String firstName = data[0];
            String middleName = data[1];
            String lastName = data[2];
            loginPageTest.login();
            pimPage.pimButton.click();
            pimPage.addButton.click();
            Thread.sleep(5000);
            pimPage.firsNameField.sendKeys(firstName);
            pimPage.middleNameField.sendKeys(middleName);
            pimPage.lastNameField.sendKeys(lastName);
            pimPage.saveButton.click();
            pimPage.requireMessgage.should(Condition.exist);
            pimPage.redirectUserPage.shouldNot(Condition.exist);
            Thread.sleep(5000);
        }
        reader.close();
    }
}
