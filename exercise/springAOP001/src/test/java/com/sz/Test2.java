package com.sz;

import com.sz.pojo.User;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


    @Test
    public void m1(){

        ApplicationContext context=new ClassPathXmlApplicationContext("app1.xml");
        UserService userService= (UserService) context.getBean("service");
        userService.delect();
        userService.delect(80,new User("李大跳"));

    }

}

