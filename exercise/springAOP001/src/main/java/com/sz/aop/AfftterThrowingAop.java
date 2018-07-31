package com.sz.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfftterThrowingAop {

    @AfterThrowing(pointcut = "execution(public void com.sz.service.StudentSerivce.*(..))")
    public void throwing(){
        System.out.println("进行异常处理");
    }

}
