package com.runner;

import com.codeborne.selenide.Condition;
import com.page.SearchPage;
import com.setup.DashboardPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;

public class SearchPageTest extends DashboardPage {

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
    Thread.sleep(5000);
    }
    @Test
    public void usernameSearchField() throws InterruptedException{
        loginPageTest.login();
        enterAdminPage();
        searchPage.userNameUserEnter.sendKeys("Admin");
        searchPage.searchButton.click();
        Thread.sleep(5000);
    }


    @Test
    public void employeeNameSearchField() throws InterruptedException{
        loginPageTest.login();
        enterAdminPage();
        searchPage.employeeNameEnter.sendKeys("Anthony  Nolan");
        searchPage.searchButton.click();
        searchPage.invalidMessage.shouldBe(exactText("Invalid"));
        Thread.sleep(5000);
    }

}
