package com.dao;

import com.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(int id);
    Student findById(int id);
    List<Student>findAdv(Map<String, Object>map);
    List<Student> findAll();
}
