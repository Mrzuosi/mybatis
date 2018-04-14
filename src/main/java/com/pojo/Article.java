package com.pojo;

import java.util.Date;
import java.util.List;

public class Article {
    private Integer atcid;
    private String title;
    private String content;
    private Date publish_time;
    private Integer au_id;
    private List<ArticleCommt> articlecommts;

    public List<ArticleCommt> getArticlecommts() {
        return articlecommts;
    }

    public void setArticlecommts(List<ArticleCommt> articlecommts) {
        this.articlecommts = articlecommts;
    }

    public Integer getAtcid() {
        return atcid;
    }

    public void setAtcid(Integer atcid) {
        this.atcid = atcid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }
}
