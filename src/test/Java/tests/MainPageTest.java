package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class MainPageTest extends TestBase {

    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check the Genres")
    @Test
    void test1Genres() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Choose 'Genres' module", () ->
                mainPage.genres());
            step("Choose books for easy reading", () ->
                    mainPage.easyReadGenres());
        step("Choose 'Genres' module", () ->
                mainPage.genres());
             step("Choose books for children", () ->
                    mainPage.childBooksGenres());
    }

    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check the Carousel Button")
    @Test
    void test2carousel() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage
                .openMainPage()
                .carouselButton();
    }

    @ValueSource(strings = {"Стеклянный меч","Мастер и маргарита","Шолох"})
    @ParameterizedTest
    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("Book title search")
    @Test
    void test3titleSearch(String search) {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Enter a book title", () ->
                mainPage.setSearchModule(search));
        step("Choose a book", () ->
                mainPage.clickBook());
        step("Put the book down in my books", () ->
                mainPage.clickFavBook());
    }

    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("NewBooks")
    @Test
    void test4clickNovieModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Choose a module", () ->
                        mainPage.novieModuleClick());
    }

    @Feature("Tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check My books")
    @Test
    void test5myBooksModule() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Open 'my book' module. Check that the books from test 3 are displayed",() ->
                mainPage.booksModuleClick());
    }
}

