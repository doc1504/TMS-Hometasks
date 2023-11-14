package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("@annotation(org.example.BenchMark)")
    public void myPointCut() {

    }
    @Around("myPointCut()")
    public void doAspect (ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        joinPoint.proceed();
        long end = System.nanoTime();
        String name = joinPoint.getSignature().getName();
        System.out.println(" Time of execution: " + name + " is " + (end - start));

    }
}
