package com.sz.bean;

public class Fies1 {
    private int id;

    public void sa(){
        System.out.println("这是一个连接");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fies1{" +
                "id=" + id +
                '}';
    }
}
