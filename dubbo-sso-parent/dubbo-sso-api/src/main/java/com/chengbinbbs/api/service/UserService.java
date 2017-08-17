package com.chengbinbbs.api.service;

import com.chengbinbbs.api.entity.UserDTO;

/**
 * @author zhangcb
 * @created on 2017/5/23.
 */
public interface UserService {

    UserDTO findByName(String name);
}
