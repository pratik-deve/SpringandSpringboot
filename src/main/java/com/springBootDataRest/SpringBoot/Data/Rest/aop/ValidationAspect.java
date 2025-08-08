package com.springBootDataRest.SpringBoot.Data.Rest.aop;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    private static final Logger logger = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution (* com.springBootDataRest.SpringBoot.Data.Rest.service.JobService.getJob(..)) && args(postId)")
    private Object validateId(ProceedingJoinPoint jp, int postId) throws Throwable {

        if(postId < 0) {
            logger.info("Provided negative post id");
            postId = -postId   ;
        }

        Object obj =  jp.proceed(new Object[]{postId});
        return obj;

    }
}
