package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.model.Status;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AutorisationPage {
    private final SelenideElement
            pwd = $("[id = open_pwd_main]"),
            login = $("[name = login"),
            loginButton = $("[id = login_btn]"),
            cabinet = $(".Profile-module__profileLink_13q2d"),
            personalAccount = $(".personal_cabinet_notifications"),
            exitFromAccount = $(".Menu__exit_TFDJG");

    public AutorisationPage openAutoPage() {
        open("https://www.litres.ru/pages/login/");
        return this;}
    public void entryValidLogin(String signInEmail) { login.setValue(signInEmail);}
    public void entryValidPassword(String signInPassword){ pwd.setValue(signInPassword);}
    public void clickOnCabinet(){
        cabinet.click();
        personalAccount.shouldHave(visible);}
    public void exit(){exitFromAccount.click();}
    public Status entryInvalidLogin(String signInInvalidEmail) { login.setValue(signInInvalidEmail);
        return null;
    }
    public Status entryInValidPassword(String signInIvalidPassword){ pwd.setValue(signInIvalidPassword);
        return null;
    }
    public void pressTheButton(){ loginButton.click();}
}

