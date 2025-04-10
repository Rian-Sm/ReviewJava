package com.example.App.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginingAspect {

    @Before("execution(* com.example.App.Service.*.*(..))")
    public void logBeforeMethod() {
        System.out.println("\n\nExecutando log antes do método...\n\n");
    }

    @After("execution(* com.example.App.Service.*.*(..))")
    public void logAfterMethod() {
        System.out.println("\n\nExecutando log após o método...\n\n");
    }

}
