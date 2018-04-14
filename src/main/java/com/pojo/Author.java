package com.pojo;

import java.util.Date;
import java.util.List;

public class Author {
    private Integer id;
    private String name;
    private String sex;
    private Date birhtday;
    private String address;
    private String phone;
    private List<Article> articles;
    private List<ArticleCommt> articlecommts;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<ArticleCommt> getArticlecommts() {
        return articlecommts;
    }

    public void setArticlecommts(List<ArticleCommt> articlecommts) {
        this.articlecommts = articlecommts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirhtday() {
        return birhtday;
    }

    public void setBirhtday(Date birhtday) {
        this.birhtday = birhtday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
