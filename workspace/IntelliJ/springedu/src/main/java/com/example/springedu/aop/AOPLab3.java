package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@Slf4j
public class AOPLab3 {
    @Around("within(*..controller.EmpController)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start();
        Object result = pjp.proceed();
        sw.stop();

        log.info(pjp.getTarget().getClass().getName() + " - 수행시간(밀리초) - " + sw.getTotalTimeMillis());
        return result;
    }
}
