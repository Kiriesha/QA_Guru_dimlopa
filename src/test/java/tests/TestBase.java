package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import config.AppConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.AutorisationPage;
import pages.MainPage;

public class TestBase {

    private static final AppConfig APP_CONFIG = ConfigFactory.create(AppConfig.class, System.getProperties());

    public final MainPage mainPage = new MainPage();
    public final AutorisationPage autoPage = new AutorisationPage();

    @BeforeAll
    static void configure() {
//        System.setProperty("chromeoptions.prefs", "intl.accept_languages=ru");

        Configuration.baseUrl = APP_CONFIG.baseUrl();
        Configuration.browser = APP_CONFIG.browser();
        Configuration.browserSize = APP_CONFIG.browserSize();
        Configuration.browserVersion = APP_CONFIG.browserVersion();

        String remoteUrl = APP_CONFIG.remoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
    }

    @AfterEach
    void addAttach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}