package tests.ui;

import config.AppConfig;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static config.AppConfig.invalidUserEmail;
import static io.qameta.allure.Allure.step;

public class LoginTest extends TestBase {
    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("Valid authorization")
    @Test
    void validAuthorization() {
        Allure.step("Open authorization page 'https://www.litres.ru/pages/login/'", () ->
                autoPage.openAutoPage());

        step("Entering a valid Login", ()
                -> autoPage.entryValidLogin(AppConfig.userEmail()));

        step("Entering a valid password", () ->
                autoPage.entryValidPassword(AppConfig.password()));

        step("Press the button", () ->
                autoPage.pressTheButton());

        step("Click on the personal account", () ->
                autoPage.clickOnCabinet());
    }
    @DisplayName("Invalid authorization")
    @Test
    void invalidAuthorization() {
        step("Open authorization page 'https://www.litres.ru/pages/login/'",
                autoPage::openAutoPage);

        step("Entering an invalid Login",
                autoPage.entryInvalidLogin(AppConfig.invalidUserEmail()));

        step("Entering an invalid password",
                autoPage.entryInValidPassword(AppConfig.invalidUserEmail()));

        step("Press the button",
                autoPage::pressTheButton);
    }
}