package com.sz.dao.impl;

import com.sz.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void eat() {
        System.out.println("dao");
    }
}
