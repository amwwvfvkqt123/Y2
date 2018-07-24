package com.sz.bean;

public class Book {
    private Double price;
    private String name;

    public void into() {
        System.out.println("无原则");
    }

    public Book() {
        System.out.println("这是好东西");
    }
    public void destroy(){
        System.out.println("死了");
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
