package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement
            searchModule = $(".SearchForm-module__input_krNG2"),
            clickButton = $(".SearchForm-module__button_zMwhB"),
            clickBook = $(".Book-module__title_2mdk-"),
            clickFavButton = $(".art-buttons__favorite"),
            novieModule = $x("//a[@href=\"/novie/\"]"),
            myBooksModule = $x("//a[@href=\"/pages/my_books_all/\"]");


    @Step("Open main page")
    public MainPage openMainPage(){
        open("/");
        return this;
    }
    @Step("Search books Test")
    public void setSearchModule() {
        // searchModule.click();
        searchModule.setValue("Стеклянный меч");
        clickButton.click();
        clickBook.click();
        //clickFavButton.click();
    }


  @Step("Test novie Module")
  public void novieModuleClick() {
      novieModule.click();
  }

    @Step("Test My Books module")
    public void booksModuleClick(){
        myBooksModule.click();
    }

}
