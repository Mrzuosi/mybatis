package com.pojo;

import java.util.Date;

public class ArticleCommt {
    private Integer atccid;
    private Integer au_id;
    private Integer ar_id;
    private String commt;
    private Date commt_time;
    private Article Carticle;
    private Author Cauthor;

    public Integer getAtccid() {
        return atccid;
    }

    public void setAtccid(Integer atccid) {
        this.atccid = atccid;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public Integer getAr_id() {
        return ar_id;
    }

    public void setAr_id(Integer ar_id) {
        this.ar_id = ar_id;
    }

    public String getCommt() {
        return commt;
    }

    public void setCommt(String commt) {
        this.commt = commt;
    }

    public Date getCommt_time() {
        return commt_time;
    }

    public void setCommt_time(Date commt_time) {
        this.commt_time = commt_time;
    }

    public Article getCarticle() {
        return Carticle;
    }

    public void setCarticle(Article carticle) {
        Carticle = carticle;
    }

    public Author getCauthor() {
        return Cauthor;
    }

    public void setCauthor(Author cauthor) {
        Cauthor = cauthor;
    }
}
