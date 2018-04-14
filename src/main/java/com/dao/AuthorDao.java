package com.dao;

import com.pojo.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> findAll();
}
