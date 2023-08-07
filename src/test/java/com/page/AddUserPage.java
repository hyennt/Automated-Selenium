package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddUserPage {
    public SelenideElement addButton =$("button.oxd-button.oxd-button--medium.oxd-button--secondary[type='button'][data-v-10d463b7]");
    public SelenideElement employeeNameEnter =$("form.oxd-form .oxd-grid-item:nth-child(2) input");
    public SelenideElement usernameInputField =$("form.oxd-form .oxd-input--active[data-v-1f99f73c]:nth-child(1)");
    public SelenideElement passwordInputField =$("form.oxd-form .oxd-input--active[data-v-1f99f73c]:nth-child(2)");
    public SelenideElement confirmPasswordInputField =$("form.oxd-form .oxd-input--active[data-v-1f99f73c][type='password']:nth-child(3)");
}
