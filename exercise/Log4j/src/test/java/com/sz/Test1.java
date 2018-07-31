package com.sz;

import com.sz.service.BenkSerivce;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("app1.xml");
        BenkSerivce benkSerivce = ctx.getBean("benkSerivce", BenkSerivce.class);
        benkSerivce.payBenkSerivce("我不知道我在哪时机");
    }

}