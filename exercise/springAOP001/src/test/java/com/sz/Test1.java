package com.sz;

import com.sz.service.StudentSerivce;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        UserService userService=context.getBean("service",UserService.class);
        StudentSerivce studentService=context.getBean("student",StudentSerivce.class);
        userService.add();
        studentService.add();
    }
    @Test
    public void m2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        UserService userService=context.getBean("service",UserService.class);
        StudentSerivce studentService=context.getBean("student",StudentSerivce.class);
        userService.add1("小明");
        studentService.add1("小明");
    }

}
