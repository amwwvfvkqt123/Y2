package com.sz.service;

public class StudentSerivce {


    public void add() {
        System.out.println("student add...");
    }

    public void add1(String name) {
        System.out.println(name + "student add.....");
    }

    public void minkes(){
        System.out.println("你姑姑");
        throw new RuntimeException("这个就是我想要的异常");
    }

    public String login(String name,String avg){
        System.out.println("蒙奇 D 路飞");
        return "呵呵";
    }

}
