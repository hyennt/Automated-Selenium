package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement topDownButton =$("[data-v-f0c5131f]");
    public SelenideElement adminPageButton =$("[data-v-6475d26d]");
    public SelenideElement userRoleScrollButton =$("[data-v-67d2aedf]") ;
    public SelenideElement userRoleListBox =$(".orangehrm-container");
    public SelenideElement essEnterField =$("[data-v-67d2aedf]");
    public SelenideElement userNameUserEnter =$(".oxd-table-filter .oxd-form div.oxd-grid-item:nth-child(1) input");
    public SelenideElement employeeNameEnter =$(".oxd-table-filter .oxd-form div.oxd-grid-item:nth-child(3) input");
    public SelenideElement invalidMessage =$(".oxd-text.oxd-text--span.oxd-input-field-error-message.oxd-input-group__message");
    public SelenideElement searchButton =$("button[type='submit'][data-v-10d463b7]");


}
