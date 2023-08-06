package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement topDownButton =$("[data-v-f0c5131f]");
    public SelenideElement searchInput =$("input[data-v-636d6b87]");
    public SelenideElement adminPageButton =$("[data-v-6475d26d]");
    public SelenideElement userRoleTable =$("[role='table']");
    public SelenideElement essTable =$("[data-v-67d2aedf]");
    public SelenideElement userRoleScrollButton =$("[data-v-67d2aedf]") ;
    public SelenideElement userRoleListBox =$("role[listbox][data-v-13cf171]");
    public SelenideElement adminEnterField =$("[data-v-67d2aedf]");
    public SelenideElement essEnterField =$("[data-v-67d2aedf]");
    public SelenideElement userRoleEnter =$("[data-v-67d2aedf]") ;
    public SelenideElement userNameUserEnter =$("input[class='oxd-input oxd-input--active'][data-v-1f99f73c]");
    public SelenideElement employeeNameEnter =$("input[data-v-75e744cd]");
    public SelenideElement statusScrollDownButton =$("[data-v-bddebfba]");
    public SelenideElement enabledStatusField =$("[data-v-13cf171c][data-v-67d2aedf]");
    public SelenideElement disabledStatusField =$("[data-v-13cf171c]");
    public SelenideElement searchButton =$("button[type='submit'][data-v-10d463b7]");
    public SelenideElement resetButton =$("button[type='button'][data-v-10d463b7]");

}
