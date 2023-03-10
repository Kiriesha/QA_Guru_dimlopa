package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:app.properties"})
public interface AppConfig extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browser.version")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("browser.size")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remote.url")
    String remoteUrl();

    @Key("userEmail")
    static String userEmail() {
        return null;
    }
    @Key("password")
    static String password() {
        return null;
    }
    @Key("invalidUserEmail")
    static String invalidUserEmail();
    @Key("invalidPassword")
    String invalidPassword();


}
