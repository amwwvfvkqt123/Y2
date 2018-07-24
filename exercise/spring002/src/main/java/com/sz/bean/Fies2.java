package com.sz.bean;

public class Fies2 {
    private int id;
    public void srg(){
        System.out.println("这是一个接");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fies2{" +
                "id=" + id +
                '}';
    }
}
