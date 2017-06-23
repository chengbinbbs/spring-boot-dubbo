package com.chengbinbbs.api.dto;

import java.io.Serializable;

/**
 * 用户详情
 *
 * @author zhangcb
 * @created 2017-05-22 12:40.
 */
public class UserDTO implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
