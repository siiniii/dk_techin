package com.example.springedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPLab2 {
    @Before("execution(public String select_proc(..))")
    public void beforeSelect(JoinPoint joinPoint){
        System.out.println("[AOP}select_proc 수행전");
    }
    @After("execution(public String search_proc(..))")
    public void afterSearch(JoinPoint joinPoint){
        System.out.println("[AOP}search_proc 수행후");
    }
}
