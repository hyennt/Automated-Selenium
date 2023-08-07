package com.runner;

import com.page.SearchPage;
import com.setup.ChromeSetUpPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;

public class SearchPageTest extends ChromeSetUpPage {

    SearchPage searchPage = new SearchPage();
    LoginPageTestEdge loginPageTest = new LoginPageTestEdge();
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
