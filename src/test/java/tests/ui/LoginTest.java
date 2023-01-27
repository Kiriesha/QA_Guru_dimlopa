package tests.ui;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

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
                -> autoPage.entryValidLogin());

        step("Entering a valid password", () ->
                autoPage.entryValidPassword());

        step("Press the button", () ->
                autoPage.pressTheButton());

        step("Click on the personal account", () ->
                autoPage.clickOnCabinet());

        step("Exit from Account", () ->
                autoPage.exit());
    }
    @DisplayName("Invalid authorization")
    @Test
    void invalidAuthorization() {
        step("Open authorization page 'https://www.litres.ru/pages/login/'",
                autoPage::openAutoPage);

        step("Entering an invalid Login",
                autoPage::entryInvalidLogin);

        step("Entering an invalid password",
                autoPage::entryInValidPassword);

        step("Press the button",
                autoPage::pressTheButton);
    }
}