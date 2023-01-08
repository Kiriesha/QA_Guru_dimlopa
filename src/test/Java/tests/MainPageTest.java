package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.open;


public class MainPageTest extends TestBase {

    @ValueSource(strings = {"Стеклянный меч","Мастер и маргарита","Шолох"})
    @ParameterizedTest
    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("Book title search")
    @Test
    void test1titleSearch(String search) {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .setSearchModule(search);

    }


    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("NewBooks")
    @Test
    void test2clickNovieModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .novieModuleClick();
    }

    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check My books")
    @Test
    void test3myBooksModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .booksModuleClick();
    }
}

