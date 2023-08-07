package com.runner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.page.SearchPage;
import com.setup.EdgeSetupPage;
import com.setup.FireFoxSetUpPage;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static com.codeborne.selenide.Condition.exist;

public class SearchDataDrivenTest extends FireFoxSetUpPage {
    LoginPageTest loginPageTest = new LoginPageTest();
    SearchPage searchPage = new SearchPage();
    SearchPageTest searchPageTest = new SearchPageTest();

    @Test
    public void usernameSearchField() throws InterruptedException, IOException, CsvValidationException {
        String csvFile = "src/test/resources/testUserNameData.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] data;
        while ((data = reader.readNext()) != null){
            String username = data[0];
            loginPageTest.login();
            searchPageTest.enterAdminPage();
            searchPage.userNameUserEnter.sendKeys(username);
            searchPage.searchButton.click();
            Thread.sleep(5000);
            searchPage.userRoleListBox.should(exist);
            loginPageTest.logout();
        }
        reader.close();
    }
}
