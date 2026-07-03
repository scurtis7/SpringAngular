package com.scurtis.server.config;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "scurtis")
public class AppConfig {

    private String appVersion;

    @PostConstruct
    public void init() {
        log.info("sa-server Version: {}", appVersion);
    }

}
