package com.dao;

import com.pojo.ClassInfo;
import com.pojo.Student;

import java.util.List;

public interface ClassInfoDao {
    ClassInfo findById(int classId);
    List<ClassInfo>findAll();
}
