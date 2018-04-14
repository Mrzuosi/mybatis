package com.newer.test;


import com.dao.AuthorDao;
import com.dao.ClassInfoDao;
import com.pojo.*;
import com.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CarTest {

    @Test
    public void test1(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        List<Author> authors=dao.findAll();
        for (Author a:authors) {
            System.out.println(a.getName()+": ");
            for (Article at:a.getArticles()) {
                System.out.println(at.getTitle()+"   "+at.getContent());
                int i=1;
                for(ArticleCommt atcc:at.getArticlecommts()){
                    System.out.println(i+": "+atcc.getCommt());
                    i++;
                }
            }
        }
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void test2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ClassInfoDao dao=sqlSession.getMapper(ClassInfoDao.class);
        List<ClassInfo> list=dao.findAll();
        for(ClassInfo c:list){
            System.out.println(c.getClassName()+":  ");
            for(Student student:c.getStudents()){
                System.out.println(student.getStuName());
            }
        }
    }
}
