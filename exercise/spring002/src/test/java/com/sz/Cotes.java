package com.sz;

import com.sz.bean.Grale;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cotes {

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");

        Grale grale=context.getBean("girl",Grale.class);
        System.out.println(grale);
    }

    @Test
    public void m2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");

        Grale grale=context.getBean("a1",Grale.class);
        System.out.println(grale.getNoe());
    }

    @Test
    public void m3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
        Grale grale=context.getBean("a2",Grale.class);
        System.out.println(grale.getBooks());
    }

    @Test
    public void m4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
        Grale grale=context.getBean("a5",Grale.class);
        System.out.println(grale);
    }


}
