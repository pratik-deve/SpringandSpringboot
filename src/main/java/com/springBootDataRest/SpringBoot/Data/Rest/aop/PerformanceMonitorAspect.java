package com.springBootDataRest.SpringBoot.Data.Rest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class PerformanceMonitorAspect {

    private static  final Logger logger = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution (* com.springBootDataRest.SpringBoot.Data.Rest.service.JobService.getAllJobs(..))")
    private Object monitorTime(ProceedingJoinPoint jp) throws Throwable {

        long start = System.currentTimeMillis();

        Object obj = jp.proceed();
        long end = System.currentTimeMillis();

        logger.info(jp.getSignature().getName() + " took " + (end-start) + " ms ");
        return obj;
    }
}
