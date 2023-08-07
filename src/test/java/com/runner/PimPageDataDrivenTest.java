package com.runner;

import com.codeborne.selenide.Condition;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.page.PimPage;
import com.setup.ChromeSetUpPage;
import com.setup.EdgeSetupPage;
import com.setup.FireFoxSetUpPage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class PimPageDataDrivenTest extends EdgeSetupPage {
    LoginPageTest loginPageTest = new LoginPageTest();
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
            if (Objects.equals(firstName, "") && Objects.equals(firstName, "")&& Objects.equals(lastName, "")){
                reader.close();
            }
            loginPageTest.login();
            pimPage.pimButton.click();
            pimPage.addButton.click();
            pimPage.firsNameField.sendKeys(firstName);
            pimPage.middleNameField.sendKeys(middleName);
            pimPage.lastNameField.sendKeys(lastName);
            pimPage.saveButton.click();
            pimPage.userPage.should(Condition.exist);
            Thread.sleep(5000);
            loginPageTest.logout();
        }
        reader.close();
    }
}
