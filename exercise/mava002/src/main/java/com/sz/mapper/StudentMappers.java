package com.sz.mapper;

import com.sz.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMappers {


    /**
     * 动态插入sql
     * @param student
     * @return
     */
    int inserTive(Student student);

    List<Student> listAll(Student student);

    List<Student> listsid(@Param("user_id") Integer user_id);

    int userUName(Student student);

    List<Student> listage();

}
