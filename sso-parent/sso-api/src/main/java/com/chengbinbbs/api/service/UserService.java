package com.chengbinbbs.api.service;

import com.chengbinbbs.api.dto.UserDTO;

/**
 * 定义接口
 * @author zhangcb
 * @created on 2017/5/22.
 */
public interface UserService {

    UserDTO findByName(String name);
}
