package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:config/${driver}.properties",
        "classpath:config/local.properties"
})
public interface DriverConfig extends Config {
    @Key("is.remote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("browser.remote.url")
    String browserRemoteUrl();
}
