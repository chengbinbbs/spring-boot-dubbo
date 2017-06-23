package com.chengbinbbs.dao;


import com.chengbinbbs.domain.User;

/**
 * @author zhangcb
 * @created on 2017/5/15.
 */
public interface UserMapper {

    User findByName(String name);
}
