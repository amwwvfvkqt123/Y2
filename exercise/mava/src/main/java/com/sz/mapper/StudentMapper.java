package com.sz.mapper;

import com.sz.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

     List<Student> listAll();

     void  inst(Student student);

     Student selectByName(String name);

//    Student selectByNameAge(String name,int price);

    Student selectByNameAge(@Param("name") String name, @Param("price") int price);
}
