package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AutorisationPage {
    SelenideElement
            //loginModule = $(".Popover-module__mask"),
            autoModule = $(".AuthorizationPopup-module__step"),
            pwd = $("[id = open_pwd_main]"),
            login = $("[name = login"),
            loginButton = $("[id = login_btn]"),
            cabinet = $(".Profile-module__profileLink_13q2d"),
            personalAccount = $(".personal_cabinet_notifications"),
            exitFromAccount = $(".Menu__exit_TFDJG");



    @Step("Open main page")
    public AutorisationPage openAutoPage() {
        open("https://www.litres.ru/pages/login/");
        return this;
    }

    public void entryValidLogin() { login.setValue("testforqa@test.com");}
    public void entryValidPassword(){ pwd.setValue("Testforqa1");}
    public void clickOnCabinet(){
        cabinet.click();
        personalAccount.shouldHave(visible);}
    public void exit(){exitFromAccount.click();}

    public void entryInvalidLogin() { login.setValue("test");}
    public void entryInValidPassword(){ pwd.setValue("Test");}


    public void pressTheButton(){ loginButton.click();}

    }

//    public AutorisationPage setLogin() {
//        authorizationLogin.setValue("testforqa@test.ru");
//        submitContainer.click();
//        return this;
//    }
//
//    public AutorisationPage setPassword() {
//        authorizationPassword.setValue("Testforqa1");
//        submitContainer.click();
//        return this;
//    }
//
//    public AutorisationPage checkLogin() {
//        profileSection.shouldHave(visible);
//        return this;
//    }
//}
// login: "testforqa@test.ru"
// password: "Testforqa1"