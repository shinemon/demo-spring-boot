package com.mailshine.springboot.aop.aspectj.advise;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAdvice {

    @Around("@annotation(com.mailshine.springboot.aop.aspectj.advise.TrackExecutionTime)")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endtime = System.currentTimeMillis();
        log.info("Class Name: "+ point.getSignature().getDeclaringTypeName() +". Method Name: "+ point.getSignature().getName() + ". Time taken for Execution is : " + (endtime-startTime) +"ms");
        return object;
    }

   /* @Before("execution(* com.mailshine.springboot.aop.aspectj.service.EmployeeService.*(..))")
    public void executionTimeBefore(JoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        //long endtime = System.currentTimeMillis();
        log.info("Method Name: "+ point.getSignature().getName() + ". Time taken for Execution is : " + (startTime) +"ms");
    }

    @After("execution(* com.mailshine.springboot.aop.aspectj.service.EmployeeService.*(..))")
    public void executionTimeAfter(JoinPoint point) throws Throwable {
       // long startTime = System.currentTimeMillis();
        long endtime = System.currentTimeMillis();
        log.info("Method Name: "+ point.getSignature().getName() + ". Time taken for Execution is : " + (endtime) +"ms");
    }*/
}
