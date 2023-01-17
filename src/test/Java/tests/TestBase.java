package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.TestsConfig;

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
//
//    @BeforeAll
//    static void setUp() {
//        WebDriver.configure();
//    }
//
//    @BeforeEach
//    public void addListener() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//    }
//
//    @AfterEach
//    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();
//        closeWebDriver();
//    }
//

    @BeforeAll
    static void Configuration() {

        SelenideLogger.addListener("Allure", new AllureSelenide());


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.baseUrl = ("https://www.litres.ru");

        String browserName = System.getProperty("browser", "chrome");
        String browserVersion = System.getProperty("browserVersion", "100");
        String browserSize = System.getProperty("browserSize",  "1600x800");
        String remoteUrl = System.getProperty("remote",  "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        Configuration.browser= browserName;
        Configuration.browserVersion= browserVersion;
        Configuration.browserSize = browserSize;
        Configuration.holdBrowserOpen = false;
        if(remoteUrl!= null ){
            Configuration.remote = remoteUrl;
        }

    }

//    TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        String browserName = System.getProperty("browser", "chrome");
//        String browserVersion = System.getProperty("browserVersion", "100");
//        String browserResolution = System.getProperty("browserSize",  "1600x800");
//        String remoteUrl = System.getProperty("remote",  "https://user1:1234@selenoid.autotests.cloud/wd/hub");
//
//        Configuration.browser = browserName;
//        Configuration.browserVersion = browserVersion;
//        Configuration.baseUrl = config.baseUrl();
//        Configuration.browserSize = browserResolution;
//        Configuration.holdBrowserOpen = true;
//        Configuration.remote = remoteUrl;
//
//        Configuration.browserCapabilities = capabilities;
////        capabilities.setCapability("enableVNC", true);
////        capabilities.setCapability("enableVideo", true);
//
//
//
//        String configSource = config.remote();
//
//        if (configSource != null) {
//            String selenoidLogin = config.selenoidLogin(),
//                    selenoidPassword = config.selenoidPassword();
//
//            Configuration.remote = String.format("https://user1:1234@selenoid.autotests.cloud/wd/hub",
//                    selenoidLogin, selenoidPassword);
//
////        if (config.remote()) {
////            String selenoidLogin = config.selenoidLogin(),
////                    selenoidPassword = config.selenoidPassword();
////
////            Configuration.remote = String.format("https://@selenoid.autotests.cloud/wd/hub",
////                    selenoidLogin, selenoidPassword);
////
////        }
////    }
//        }}
    @AfterEach
    void addAttach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
