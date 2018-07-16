package com.sz;

import com.sz.entity.Student;
import com.sz.mapper.StudentMapper;
import com.sz.util.Studentutil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Test1 {

    @Test
    public void ml() {
        // 1 定义mybatis核心配置文件的位置
        String resource = "mybatis.cfg.xml";
        // 2 通过mybatis的工具类加载这个文件为输入流
        InputStream in = null;
        SqlSessionFactory sessionFactory = null;
        SqlSession sqlSession = null;
        try {
            in = Resources.getResourceAsStream(resource);
            // 3 创建一个会话工厂  会话工厂的建造者（一次性用品）
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
            // 4 利用工厂生产会话E  / J[5 ZA
            sqlSession = sessionFactory.openSession();
            // 5 使用会话进行相关的操作

            // 得到一个Mapper，mybatis本身通过动态代理帮我们去创建实例
            // 记住他就行了。

            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> stu = mapper.listAll();
            System.out.println(stu);
//            List<Student> list =sqlSession.selectList("com.sz.dao.StudentMapper.listAll");
//            System.out.println(list);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void m2() {

        SqlSession sqlSession = Studentutil.getSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.listAll();
        System.out.println(list);
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Test
    public void insert() {

        Student s = new Student();
        s.setISBN("kt1-1-1");
        s.setName("李白");
        s.setPrice(18);
        s.setDiscount("5折");
        s.setPublisher("广西");
        SqlSession sqlSession = Studentutil.getSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.inst(s);
            List<Student> list = mapper.listAll();
            System.out.println(list);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void ByName() {
        SqlSession sqlSession = Studentutil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student name = mapper.selectByName("李让");
        System.out.println(name);
    }

    @Test
    public void ByNameAge() {
        SqlSession sqlSession = Studentutil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student name = mapper.selectByNameAge("李白", 50);
        System.out.println(name);
    }
}
