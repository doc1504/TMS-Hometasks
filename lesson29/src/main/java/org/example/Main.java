package org.example;

import org.example.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.config");
        context.registerShutdownHook();
        RaceService raceServiceBean = context.getBean(RaceService.class);
        raceServiceBean.runRace();
        raceServiceBean.checkResult();
    }
}