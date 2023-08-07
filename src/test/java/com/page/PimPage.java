package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class PimPage {
    public SelenideElement pimButton =$("[href=\"/web/index.php/pim/viewPimModule\"][data-v-6475d26d]");
    public SelenideElement addButton =$("button.oxd-button.oxd-button--medium.oxd-button--secondary[type='button'][data-v-10d463b7]");
    public SelenideElement firsNameField =$("input.oxd-input.oxd-input--active.orangehrm-firstname[data-v-1f99f73c][name='firstName']");
    public SelenideElement middleNameField =$("input.oxd-input.oxd-input--active.orangehrm-middlename[data-v-1f99f73c][name='middleName']");
    public SelenideElement lastNameField =$("input.oxd-input.oxd-input--active.orangehrm-lastname[data-v-1f99f73c][name='lastName']");
    public SelenideElement employeeIDField =$("input.oxd-input.oxd-input--active[data-v-1f99f73c]");
    public SelenideElement saveButton =$("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space[type='submit'][data-v-10d463b7][data-v-7fe2d320]");

}
