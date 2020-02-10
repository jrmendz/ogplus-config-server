package com.og.ogplus.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PandaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandaConfigServerApplication.class, args);
    }

}
