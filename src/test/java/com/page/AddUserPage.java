package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddUserPage {
    public SelenideElement topDownButton =$("[data-v-f0c5131f]");
    public SelenideElement adminPageButton =$("[data-v-6475d26d]");
    public SelenideElement addButton =$("button[type='button']");
    public SelenideElement userRoleScrollButton =$("[data-v-67d2aedf]");
    public SelenideElement essUserRoleEnter =$("[data-v-bddebfba][data-v-67d2aedf]");
    public SelenideElement adminUserRoleEnter =$("[data-v-67d2aedf]");
    public SelenideElement employeeNameEnter =$("[data-v-75e744cd][data-v-390abb6d]");
    public SelenideElement statusButton =$("[data-v-bddebfba][data-v-67d2aedf]");
    public SelenideElement enabledField =$("[data-v-67d2aedf]");
    public SelenideElement disabledField =$("[data-v-67d2aedf][data-v-bddebfba]");
    public SelenideElement usernameInputField =$("input[data-v-1f99f73c]");
    public SelenideElement passwordInputField =$("[data-v-957b4417]input[data-v-1f99f73c]");
    public SelenideElement confirmPasswordInputField =$("input[type='password']");
}
