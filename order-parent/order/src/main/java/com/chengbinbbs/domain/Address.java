package com.chengbinbbs.domain;

import java.io.Serializable;

/**
 * 地址实体类
 *
 * @author zhangcb
 * @created 2017-05-18 13:59.
 */
public class Address implements Serializable{

    private Long id;

    private Long userId;

    private String provience;

    private String city;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
