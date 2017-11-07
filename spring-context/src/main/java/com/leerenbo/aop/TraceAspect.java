package com.leerenbo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by lirenbo on 2017/11/6.
 */
@Aspect
@Component
public class TraceAspect {

    @Pointcut("execution(* com.leerenbo..*(..))")
    private void aTrace() {
    }

    @Around("aTrace()")
    private Object arount(ProceedingJoinPoint pjp) {
        String method = pjp.getSignature().getName();
        String classSimpleName = pjp.getSignature().getDeclaringTypeName();
        Object[] args = pjp.getArgs();

        System.out.println(classSimpleName + method + args);

        Object returnValue = null;

        try {
            returnValue = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return returnValue;
    }


}
