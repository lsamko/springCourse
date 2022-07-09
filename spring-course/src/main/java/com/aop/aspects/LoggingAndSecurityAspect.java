package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.aop.UniLibrary.get*())")
    private void allGetMethodsThroughUniLibrary() {
    }

    @Pointcut("execution(* com.aop.UniLibrary.return*())")
    private void allReturnMethodsThroughUniLibrary() {
    }

    @Pointcut("allGetMethodsThroughUniLibrary() || allReturnMethodsThroughUniLibrary()")
    private void allGetOrReturnMethodsThroughUniLibrary() {
    }


    @Pointcut("execution(* com.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }
    @Pointcut("execution(public void com.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }
    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

@Before("allMethodsExceptReturnMagazineFromUniLibrary()")
public void beforeAllMethodsExceptReturnMagazineAdvice(){
    System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
}

    @Before("allGetMethodsThroughUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsThroughUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetOrReturnMethodsThroughUniLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeGetOrReturnLoggingAdvice: writing Log #3");
    }


}
