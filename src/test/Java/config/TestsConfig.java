package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:selenoid.properties"
})
public interface TestsConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();
    @Key("version")
    @DefaultValue("109.0")
    String version();
    @Key("baseUrl")
    @DefaultValue("https://www.litres.ru")
    String baseUrl();
    @Key("resolution")
    @DefaultValue("1920x1080")
    String resolution();
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remote();

    @Key("selenoidLogin")
    String selenoidLogin();
    @Key("selenoidPassword")
    String selenoidPassword();
}
