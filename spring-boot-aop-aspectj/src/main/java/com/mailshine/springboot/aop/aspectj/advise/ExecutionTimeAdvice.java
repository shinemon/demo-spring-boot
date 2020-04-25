package com.mailshine.springboot.aop.aspectj.advise;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
        log.info("Method Name: "+ point.getSignature().getName() + ". Time taken for Execution is : " + (endtime-startTime) +"ms");
        return object;
    }
}
