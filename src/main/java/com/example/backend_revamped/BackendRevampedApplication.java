package com.example.backend_revamped;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BackendRevampedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendRevampedApplication.class, args);
    }



}
