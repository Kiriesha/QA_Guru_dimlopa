package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class MainPageTest extends TestBase {

    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("Book title search")
    @Test
    void titleSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .setSearchModule();

    }


    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("NewBooks")
    @Test
    void clickNovieModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .novieModuleClick();
    }


    @Feature("UI tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check My books")
    @Test
    void myBooksModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .booksModuleClick();
    }
}

