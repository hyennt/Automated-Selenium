package com.runner;

import com.page.AddUserPage;
import com.page.SearchPage;
import com.setup.ChromeSetUpPage;
import org.junit.jupiter.api.Test;

public class AddUserPageTest extends ChromeSetUpPage {
    AddUserPage addUserPage = new AddUserPage();
    LoginPageTest loginPageTest = new LoginPageTest();
    SearchPage searchPage = new SearchPage();
    @Test
    private void enterAdminPage() {
        searchPage.topDownButton.click();
        searchPage.adminPageButton.click();
    }
    @Test
    public void addEmployeeField() throws InterruptedException{
        loginPageTest.login();
        enterAdminPage();
        addUserPage.addButton.click();
        addUserPage.employeeNameEnter.sendKeys("Hoang Yen");
        addUserPage.usernameInputField.sendKeys("yennguyen");
        addUserPage.passwordInputField.sendKeys("123456");
        addUserPage.confirmPasswordInputField.sendKeys("123456");
    }
}
