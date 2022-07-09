package com.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice:  ");
    }

    @Before("allGetMethods()")
    public void beforeSecurityAdvice() {
        System.out.println("Check security access");
    }
}
