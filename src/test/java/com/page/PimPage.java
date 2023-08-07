package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class PimPage {
    public SelenideElement pimButton =$("[href=\"/web/index.php/pim/viewPimModule\"][data-v-6475d26d]");
    public SelenideElement addButton =$("button.oxd-button.oxd-button--medium.oxd-button--secondary[type='button'][data-v-10d463b7]");
    public SelenideElement firsNameField =$("input.oxd-input.oxd-input--active.orangehrm-firstname[data-v-1f99f73c][name='firstName']");
    public SelenideElement middleNameField =$("input.oxd-input.oxd-input--active.orangehrm-middlename[data-v-1f99f73c][name='middleName']");
    public SelenideElement lastNameField =$("input.oxd-input.oxd-input--active.orangehrm-lastname[data-v-1f99f73c][name='lastName']");
    public SelenideElement saveButton =$("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space[type='submit'][data-v-10d463b7][data-v-7fe2d320]");
    public SelenideElement redirectUserPage =$("[href=\"/web/index.php/pim/viewPersonalDetails/empNumber\"]");
    public SelenideElement requireMessgage =$("span.oxd-text.oxd-text--span.oxd-input-field-error-message.oxd-input-group__message[data-v-7b563373][data-v-957b4417]");
    public SelenideElement personalDetail=$("[data-v-0349f171][data-v-b6d78ace]");
}
