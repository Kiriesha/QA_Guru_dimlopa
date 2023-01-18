package config;

import org.aeonbits.owner.ConfigFactory;

public class RemoteConfig {
    public static TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());
    public static boolean isRemoteWebDriver() {
        return !config.remote().equals("");
    }
}