package com.sz.controller;

import com.sz.service.UserSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userContrlooer")
public class UserContrlooer implements UserSerivice {

    @Autowired
    private UserSerivice userSerivice;

    @Override
    public void show() {
        System.out.println("service......");
    }

    public void eat() {
        System.out.println("controller.......");
        userSerivice.eat();

    }

}
