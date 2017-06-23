package com.chengbinbbs.service;

import com.chengbinbbs.api.dto.UserDTO;
import com.chengbinbbs.api.service.UserService;
import com.chengbinbbs.dao.UserMapper;
import com.chengbinbbs.domain.User;
import com.chengbinbbs.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现层
 *
 * @author zhangcb
 * @created 2017-05-22 12:46.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserDTO findByName(String name) {
        User user = userMapper.findByName(name);
        UserDTO dto = new UserDTO();
        BeanUtil.copyProperty(dto,user);
        return dto;
    }
}
