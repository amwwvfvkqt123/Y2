package com.sz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Studentutil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 1 定义mybatis核心配置文件的位置
        String resource = "mybatis.cfg.xml";
        // 2 通过mybatis的工具类加载这个文件为输入流
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(resource);
            // 3 创建一个会话工厂  会话工厂的建造者（一次性用品）
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSession(){
        return  sqlSessionFactory.openSession();
    }

}
