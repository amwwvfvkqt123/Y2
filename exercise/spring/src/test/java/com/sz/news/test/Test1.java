package com.sz.news.test;


import com.sz.old.bean.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m2(){
        ApplicationContext context=new ClassPathXmlApplicationContext
                (new String[]{"app1.xml","app2.xml"});
        Girl g= (Girl) context.getBean("gook");
        System.out.println(g);
        Girl gir = (Girl) context.getBean("gir");
        System.out.println(gir);
    }
    @Test
    public void m3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("constou.xml");
        Girl car = (Girl) context.getBean("car");
        System.out.println(car);
    }
}
