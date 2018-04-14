package com.pojo;

import java.util.Date;

public class Car {
    private Integer id;
    private String name;
    private Double price;
    private Date createDate;

    public Car(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Integer getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Double getPrice() {
        return price;
    }
}
