package com.sz;

import com.sz.entity.Student;
import com.sz.mapper.StudentMappers;
import com.sz.utile.StudentUtile;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test1 {

    @Test
    public void m1() {

        SqlSession sqlSession = StudentUtile.getSession();
        StudentMappers mapper = sqlSession.getMapper(StudentMappers.class);
        Student student = new Student();
        student.setName("李拍摄");
        mapper.inserTive(student);
        sqlSession.commit();
        if (sqlSession != null) {
            sqlSession.close();
        }

    }


    @Test
    public void m2() {
        SqlSession sqlSession = StudentUtile.getSession();
        StudentMappers mapper = sqlSession.getMapper(StudentMappers.class);
        Student student = new Student();
        student.setName("李白");
        List<Student> students = mapper.listAll(student);
        System.out.println(student);
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Test
    public void m3() {
        SqlSession sqlSession = StudentUtile.getSession();
        StudentMappers mapper = sqlSession.getMapper(StudentMappers.class);
        List<Student> listsid = mapper.listsid(1);
        System.out.println(listsid);
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Test
    public void m4() {
        SqlSession sqlSession = StudentUtile.getSession();
        StudentMappers mapper = sqlSession.getMapper(StudentMappers.class);
        Student student = new Student();
        student.setId(5);
        student.setISBN("k58243-1-451");
        student.setName("李左右");
        student.setPrice(58);
        student.setDiscount("5折");
        student.setPublisher("广西");
        mapper.userUName(student);
        sqlSession.commit();
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Test
    public void m5() {
        SqlSession session = StudentUtile.getSession();
        StudentMappers mapper = session.getMapper(StudentMappers.class);
        List<Student> ha = mapper.listage();
        System.out.println(ha);
        if (session != null) {
            session.close();
        }

    }


}
