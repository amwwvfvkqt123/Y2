package com.sz;

import com.sz.service.StudentSerivce;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        StudentSerivce student = context.getBean("student", StudentSerivce.class);
        student.login("李明","58岁");

    }
}
