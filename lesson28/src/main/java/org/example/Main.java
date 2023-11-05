package org.example;

import org.example.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");
        context.registerShutdownHook();

        RaceService raceBean = context.getBean(RaceService.class);
        raceBean.run();
        raceBean.checkResult();


    }
}