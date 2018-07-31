package com.sz.aop;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Component

@Aspect()
public class LoAp {

    @Around("execution(public * com.sz.service.*.*(..))")
    public void log(ProceedingJoinPoint pjp){

        //获取对应的日志对象
        Class clz=pjp.getTarget().getClass();
        Logger logger=Logger.getLogger(String.valueOf(clz));
        logger.info("参数列表"+Arrays.toString(pjp.getArgs()));
        long star=System.currentTimeMillis();
        try {
            pjp.proceed();
            long end=System.currentTimeMillis();
            long spendTime=(end-star);
            logger.info("耗时"+spendTime+"毫秒");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }




    }

}
