package com.liaoyb.saber.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liaoyb
 */
@SpringBootApplication
@EnableEurekaServer
public class SaberRegistryApp {
    private static final Logger log = LoggerFactory.getLogger(SaberRegistryApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SaberRegistryApp.class, args);
    }
}
