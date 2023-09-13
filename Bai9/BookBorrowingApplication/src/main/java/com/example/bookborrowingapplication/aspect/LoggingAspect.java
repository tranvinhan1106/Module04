package com.example.bookborrowingapplication.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private static long visitors = 0;
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution (* com.example.bookborrowingapplication.controller.BookController.doBorrow(..))")
    public void doBorrow() {
    }

    @Pointcut("execution (* com.example.bookborrowingapplication.controller.BookController.doReturn(..))")
    public void doReturn() {
    }

    @Before("doBorrow() , doReturn()")
    public void getLog(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Before: Call method " + methodName);
    }

    @After("doBorrow() , doReturn()")
    public void getLogAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("After: Call method " + methodName);
    }

    @After("execution (* com.example.bookborrowingapplication.controller.BookController.viewListPaging(..))")
    public void getLogAfterVisit(JoinPoint joinPoint) {
        logger.info("number:" + ++visitors);
    }
}
