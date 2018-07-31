package com.sz;

import com.sz.service.StudentSerivce;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        StudentSerivce student = context.getBean("student", StudentSerivce.class);
        UserService userService=context.getBean("service",UserService.class);
        student.minkes();

    }

}
