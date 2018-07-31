package com.sz.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void payBook(String name) {
        System.out.println("还" + name);
    }

}
