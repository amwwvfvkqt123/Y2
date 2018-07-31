package com.sz.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aftter {

    //    ..就是任意参数
    @AfterReturning(pointcut = "execution(public String delect(..))", returning = "returning")
    public void after(String returning) {
        System.out.println("这是返回"+returning);

    }

}
