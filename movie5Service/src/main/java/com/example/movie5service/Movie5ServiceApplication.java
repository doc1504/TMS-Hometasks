package com.example.movie5service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.movie5service.client")
public class Movie5ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Movie5ServiceApplication.class, args);
    }

}
