package com.academy.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppApiGateway {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppApiGateway.class);
        ConfigurableApplicationContext run = app.run(args);
    }
}
