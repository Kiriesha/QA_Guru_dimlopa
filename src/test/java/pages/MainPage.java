package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement
            searchModule = $(".SearchForm-module__input_1E6az"),
            clickButton = $(".SearchForm-module__button_3JhUZ"),
            clickBook = $(".Book-module__title_2mdk-"),
            clickFavButton = $(".art-buttons__favorite"),
            novieModule = $x("//a[@href=\"/novie/\"]"),
            myBooksModule = $x("//a[@href=\"/pages/my_books_all/\"]"),
            genresModule = $x("//a[@href=\"/pages/new_genres/\"]"),
            easyRead = $x("//a[@href=\"/genre/legkoe-chtenie-201583/\"]"),
            childBooks = $x("//a[@href=\"/genre/detskie-knigi-5007/\"]"),
            checkMyBooksVisible = $(".new-container"),
            checkTheNewModuleVisible =$(".RootGenre-module__wrapper_subscription_banner_3FZTa");


    public MainPage openMainPage(){
        open("/");
        return this; }
    public void setSearchModule(String search) {
        searchModule.setValue(search);
        clickButton.click();}
    public void clickBook(){
        clickBook.click();}
    public void clickFavBook(){
        clickFavButton.click();
    }
    public void booksModuleClick(){ myBooksModule.click();}
    public void novieModuleClick() { novieModule.click();}
    public void genres (){genresModule.click();}
    public void easyReadGenres(){easyRead.click();}
    public void childBooksGenres(){
        childBooks.click();
  }
    public MainPage checkMyBooksVisible(){
        checkMyBooksVisible.shouldBe(visible);
        return this;
  }
  public MainPage  checkTheNewModuleVisible(){
      checkTheNewModuleVisible.shouldBe(visible);
      return this;
  }
}
