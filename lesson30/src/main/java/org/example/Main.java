package org.example;

import org.example.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.config");
        RaceService bean = context.getBean(RaceService.class);
        bean.runRace();
        bean.checkResult();


    }
}