package com.sz.entity;

public class Student {
    private int id;
    private String ISBN;
    private String name;
    private int price;
    private String discount;
    private String publisher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
        public String toString() {
        return "Student{" +
                "id=" + id +
                ", ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount='" + discount + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
