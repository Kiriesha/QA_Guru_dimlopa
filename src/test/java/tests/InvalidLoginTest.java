package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Tests Litres")
@Story("Main page Litres")
public class InvalidLoginTest extends TestBase {

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