package tests.ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tests.TestBase;

import static io.qameta.allure.Allure.step;

@Feature("Tests Litres")
@Story("Main page Litres")
public class MainPageTest extends TestBase {
    @Test
    @DisplayName("Check the Genres")
    void theGenresModuleCheck() {
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

    @ValueSource(strings = {"Стеклянный меч","Мастер и маргарита","Шолох"})
    @ParameterizedTest
    @DisplayName("Book title search")
    void searchBookByTitle(String search) {
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Enter a book title", () ->
                mainPage.setSearchModule(search));
        step("Choose a book", () ->
                mainPage.clickBook());
        step("Put the book down in my books", () ->
                mainPage.clickFavBook());
    }
    @Test
    @DisplayName("NewBooks")
    void theNewModuleCheck() {
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Choose a module", () ->
                mainPage.novieModuleClick());
    }

    @Test
    @DisplayName("Check My books")
    void myBooksModuleCheck() {
        step("Open mane page 'https://www.litres.ru/'", () ->
                mainPage.openMainPage());
        step("Open 'my book' module. Check that the books from test 3 are displayed",() ->
                mainPage.booksModuleClick());
    }

}