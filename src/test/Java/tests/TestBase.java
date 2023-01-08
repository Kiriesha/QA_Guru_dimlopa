package tests;

import com.codeborne.selenide.Configuration;
import config.TestsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import pages.AutorisationPage;
import pages.MainPage;

public class TestBase {
    MainPage mainPage = new MainPage();
    AutorisationPage autoPage = new AutorisationPage();

    @BeforeAll
    static void Configuration() {
        TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());

        String browserName = String.valueOf(config.browser());
        String browserVersion = config.version();
        String browserResolution = config.resolution();

        Configuration.browser = browserName;
        Configuration.browserVersion = browserVersion;
        Configuration.baseUrl = config.baseUrl();
        Configuration.browserSize = browserResolution;
        Configuration.holdBrowserOpen = true;

    }
}
