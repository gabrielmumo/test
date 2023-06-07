package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    @Before("execution(public void createUser())")
    public void beforeUserCreation() {
        System.out.println("Running aspect before user creation");
    }
}
