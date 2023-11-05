package org.example.config;

import org.example.domain.Horse;
import org.example.domain.Pair;
import org.example.domain.Rider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.service")
public class AppConfig {
    @Bean
    Horse horse1() {
        return new Horse();
    }
    @Bean
    Horse horse2() {
        return new Horse();
    }
    @Bean
    Horse horse3 () {
        return new Horse();
    }
    @Bean
    Rider rider1() {
        return new Rider();
    }
    @Bean
    Rider rider2() {
        return new Rider();
    }
    @Bean
    Rider rider3() {
        return new Rider();
    }
    @Bean
    Pair pair1 () {
        return new Pair(1, horse1(), rider1(), 3.0, 0.0);
    }
    @Bean
    Pair pair2 () {
        return new Pair(2, horse2(), rider2(), 3.0, 0.0);
    }
    @Bean
    Pair pair3() {
        return new Pair(3, horse3(), rider3(), 3.0, 0.0);
    }



}
