package com.sz.service.impl;

import com.sz.dao.UserDao;
import com.sz.service.UserSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//注解一个bean的注解(类似于在xml当中注册一个Bean一样的)
@Component("UserSerivices")
public class UserServiceImpl  implements UserSerivice {


    @Autowired
    private UserDao userDao;


    @Override
    public void show() {
        System.out.println("skdlga");
    }

    @Override
    public void eat() {
        System.out.println("service");
        userDao.eat();

    }
}
