package com.runner;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.page.LoginPage;
import com.setup.EdgeSetupPage;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class LoginDataDrivenTest extends EdgeSetupPage {
    LoginPage loginPage = new LoginPage();
    @Test
    public void testLoginWithCSVData() throws IOException, InterruptedException, CsvValidationException {
        String csvFile = "src/test/resources/testData.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] data;
        while ((data = reader.readNext()) != null) {
            String username = data[0];
            String password = data[1];
            if (Objects.equals(username, "") || Objects.equals(password, "")){
                return;
            }

            loginPage.usernameEnter.sendKeys(username);
            loginPage.passwordEnter.sendKeys(password);
            loginPage.submitButton.click();
            Thread.sleep(2000);
        }
        reader.close();
    }
}
