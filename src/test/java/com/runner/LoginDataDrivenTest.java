package com.runner;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.page.LoginPage;
import com.setup.SetupPage;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
public class LoginDataDrivenTest extends SetupPage {
    LoginPage loginPage = new LoginPage();
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
