package com.example.springedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPLab1 {
    @Pointcut("execution(public String hello(..))")
    public void hello() {
    }
    @Before("hello()")
    public void before(JoinPoint joinPoint){
        System.out.println("[AOP hello 수행전]");
    }
    @After("hello()")
    public void after(JoinPoint joinPoint){
        System.out.println("[AOP hello 수행후]");
    }
}
