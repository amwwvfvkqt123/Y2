package com.sz.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAop {

    @Around("execution(public * com.sz.service.StudentSerivce.login(String,String))")
    public void around(ProceedingJoinPoint point){
        System.out.println("around.....");
        try {
            //方法执行
            Object proceed = point.proceed();
            System.out.println(proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
