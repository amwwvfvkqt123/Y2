package com.sz;

import com.sz.controller.UserContrlooer;
import com.sz.service.UserSerivice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest{

    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Namg.xml");
//        UserSerivice userSerivice= (UserSerivice) context.getBean("UserSerivices");
//        userSerivice.show();
        UserContrlooer userContrlooer=context.getBean("userContrlooer",UserContrlooer.class);
        userContrlooer.eat();

    }

}
