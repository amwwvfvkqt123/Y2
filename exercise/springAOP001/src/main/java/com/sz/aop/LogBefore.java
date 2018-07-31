package com.sz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//标记它为一个切面类
@Component //设置主键
@Aspect
public class LogBefore {

    //标记为前置通知
    @Before("execution(public void add())")
//    @Before("execution(* com.sz.service.*.*(..))")
    public void methonBefore(JoinPoint joinPoint) {

        Object target = joinPoint.getTarget().getClass();
        String tarce=joinPoint.getSignature().getName();

        System.out.println(tarce+target+"方法准备成功执行before......");
    }

    //标记为前置通知
    @Before("execution(public void add1())")
//    @Before("execution(* com.sz.service.*.*(..))")
    public void methonBefore1(JoinPoint joinPoint) {

        Object[] target = joinPoint.getArgs();
        int modifiers = joinPoint.getSignature().getModifiers();

        System.out.println(modifiers+ Arrays.toString(target) +"方法准备成功执行before......");
    }

}
