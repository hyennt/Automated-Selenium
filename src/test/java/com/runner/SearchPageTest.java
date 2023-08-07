package com.runner;

import com.page.SearchPage;
import com.setup.ChromeSetUpPage;
import com.setup.FireFoxSetUpPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;

public class SearchPageTest extends FireFoxSetUpPage {

    SearchPage searchPage = new SearchPage();
    LoginPageTest loginPageTest = new LoginPageTest();
    @Test
    public void enterAdminPage() {
        searchPage.topDownButton.click();
        searchPage.adminPageButton.click();
    }
    @Test
    public void SearchFAllField() throws InterruptedException{
    loginPageTest.login();
    searchPage.topDownButton.click();
    searchPage.adminPageButton.click();
    searchPage.userRoleScrollButton.click();
    searchPage.userRoleListBox.exists();
    searchPage.essEnterField.click();
    searchPage.searchButton.click();
    Thread.sleep(3000);
    searchPage.userRoleListBox.should(exist);
    }
    @Test
    public void usernameSearchField() throws InterruptedException{
        loginPageTest.login();
        enterAdminPage();
        searchPage.userNameUserEnter.sendKeys("Admin");
        searchPage.searchButton.click();
        Thread.sleep(5000);
        searchPage.userRoleListBox.should(exist);
    }


    @Test
    public void employeeNameSearchField() throws InterruptedException{
        loginPageTest.login();
        enterAdminPage();
        searchPage.employeeNameEnter.sendKeys("Anthony  Nolan");
        searchPage.searchButton.click();
        searchPage.invalidMessage.shouldBe(exactText("Invalid"));
        Thread.sleep(5000);
        searchPage.userRoleListBox.should(exist);
    }

}
