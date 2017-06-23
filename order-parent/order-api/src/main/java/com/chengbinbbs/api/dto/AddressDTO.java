package com.chengbinbbs.api.dto;

import java.io.Serializable;

/**
 * 地址详情
 *
 * @author zhangcb
 * @created 2017-05-22 13:37.
 */
public class AddressDTO implements Serializable {

    private Long id;

    private String provience;

    private String city;

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
