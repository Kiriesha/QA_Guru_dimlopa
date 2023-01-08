package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.Config;

public interface TestsConfig extends Config {
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("108.0")
    String version();
    @DefaultValue("https://www.litres.ru")
    String baseUrl();
    @DefaultValue("1920x1080")
    String resolution();
    @DefaultValue("false")
    boolean remote();


    String selenoidLogin();
    String selenoidPassword();
}
