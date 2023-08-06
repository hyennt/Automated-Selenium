package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {
    public  SelenideElement submitButton = $("button[type='submit']");
    public  SelenideElement usernameEnter = $("input[name='username']");
    public  SelenideElement passwordEnter = $("input[name='password']");
    public  SelenideElement loginErrorMessage =$("p[data-v-7b563373]");
    public SelenideElement dashboardLayout = $("[data-v-f0c5131f]");
    public SelenideElement logoutScrollDownButton = $("[data-v-bdd6d943]");
    public SelenideElement logoutButton =$("[href=\"/web/index.php/auth/logout\"]");
    public SelenideElement loginPage =$("[data-v-358db50f]");
    public SelenideElement requireMessage =$("[data-v-957b4417]");
    public SelenideElement requireMessagePassword =$("[data-v-7b563373]");

}

