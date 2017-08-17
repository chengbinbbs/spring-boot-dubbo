package com.chengbinbbs.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.chengbinbbs.api.entity.UserDTO;
import com.chengbinbbs.api.service.UserService;
import com.chengbinbbs.dao.UserMapper;
import com.chengbinbbs.domain.User;
import com.chengbinbbs.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户服务实现
 *
 * @author zhangcb
 * @created 2017-05-23 10:35.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findByName(String name) {
        User user = userMapper.findByName(name);
        UserDTO dto = new UserDTO();
        BeanUtil.copyProperty(dto,user);
        return dto;
    }
}
