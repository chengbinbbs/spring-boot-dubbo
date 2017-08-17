package com.chengbinbbs.domain;

import java.io.Serializable;

/**
 * 收货地址实体类
 *
 * @author zhangcb
 * @created 2017-05-23 11:06.
 */
public class Address implements Serializable {

    private Long id;

    private Long userId;

    private String province;

    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
