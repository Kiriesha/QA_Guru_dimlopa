package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.w3c.dom.Node;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static groovy.xml.dom.DOMCategory.text;

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
            carouselButton = $(".CarouselButtons-module__next_3b6r0");


    @Step("Open main page")
    public MainPage openMainPage(){
        open("/");
        return this;
    }

    @Step("Search books Test")
    public void setSearchModule(String search) {
        searchModule.setValue(search);
        clickButton.click();}
    public void clickBook(){
        clickBook.click();}
    public void clickFavBook(){
        clickFavButton.click();
    }

    @Step("Test My Books module")
    public void booksModuleClick(){ myBooksModule.click();}

    @Step("Test novie Module")
    public void novieModuleClick() { novieModule.click();}

     @Step("Test genres module")
        public void genres (){
        genresModule.click();}
    public void easyReadGenres(){
        easyRead.click();}
    public void childBooksGenres(){
        childBooks.click();
  }

  @Step("Social sites (youtube)")
    public void carouselButton()
  {
      carouselButton.click();
      carouselButton.click();
      carouselButton.click();
  }

}
