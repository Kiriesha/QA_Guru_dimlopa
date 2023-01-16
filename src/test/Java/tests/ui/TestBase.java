package tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.TestsConfig;
import drivers.WebDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AutorisationPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    MainPage mainPage = new MainPage();
    AutorisationPage autoPage = new AutorisationPage();

    @BeforeAll
    static void setUp() {
        WebDriver.configure();
    }

    @BeforeEach
    public void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
//    static void Configuration() {
//        SelenideLogger.addListener("Allure", new AllureSelenide());
//        TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        String browserName = String.valueOf(config.browser());
//        String browserVersion = config.version();
//        String browserResolution = config.resolution();

//        Configuration.browser = browserName;
//        Configuration.browserVersion = browserVersion;
//        Configuration.baseUrl = config.baseUrl();
//        Configuration.browserSize = browserResolution;
//        Configuration.holdBrowserOpen = true;
//
//        Configuration.browserCapabilities = capabilities;
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//
//        String configSource = config.remote();
//
//        if (configSource != null) {
//            String selenoidLogin = config.selenoidLogin(),
//                    selenoidPassword = config.selenoidPassword();
//
////        if (config.remote()) {
////            String selenoidLogin = config.selenoidLogin(),
////                    selenoidPassword = config.selenoidPassword();
////
//            Configuration.remote = String.format("https://%s:%s@selenoid.autotests.cloud/wd/hub",
//                    selenoidLogin, selenoidPassword);
//
//        }
//   }
//        @AfterEach
//        void addAttach() {
//            Attach.screenshotAs("Last screenshot");
//            Attach.pageSource();
//            Attach.browserConsoleLogs();
//            Attach.addVideo();
//        }
//
//
//    }


