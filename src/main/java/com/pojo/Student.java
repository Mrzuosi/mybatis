package com.pojo;

import java.util.Date;

public class Student {
    private Integer stuId;
    private String stuName;
    private String StuSex;
    private String stuCard;
    private Date stuJoinTime;
    private String stuAddress;
    private ClassInfo stuClass;

    public Student(){}

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return StuSex;
    }

    public void setStuSex(String stuSex) {
        StuSex = stuSex;
    }

    public String getStuCard() {
        return stuCard;
    }

    public void setStuCard(String stuCard) {
        this.stuCard = stuCard;
    }

    public Date getStuJoinTime() {
        return stuJoinTime;
    }

    public void setStuJoinTime(Date stuJoinTime) {
        this.stuJoinTime = stuJoinTime;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public void setStuClass(ClassInfo stuClass) {
        this.stuClass = stuClass;
    }

    public ClassInfo getStuClass() {
        return stuClass;
    }
}
