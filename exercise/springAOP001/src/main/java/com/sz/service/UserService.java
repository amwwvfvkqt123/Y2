package com.sz.service;

import com.sz.pojo.User;

public class UserService {

    public void add() {
        System.out.println("user add.......");
    }

    public void add1(String name) {
        System.out.println(name + "user add.......");
    }

    public String delect() {
        System.out.println("无参杀人，最为致命");
        return "极限";
    }

    public String delect(Integer num, User user) {
        System.out.println(user.getUserName() + "delete了" + num + "个人 ");
        return "轻松";
    }

}
