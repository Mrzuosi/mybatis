package com.dao;

import com.pojo.Course;

import java.util.List;

public interface CourseDao {
    List<Course> findAll();
}
