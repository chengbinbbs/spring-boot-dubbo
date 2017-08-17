package com.chengbinbbs.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chengbinbbs.api.entity.AddressDTO;
import com.chengbinbbs.api.entity.UserDTO;
import com.chengbinbbs.api.service.AddressService;
import com.chengbinbbs.api.service.UserService;
import com.chengbinbbs.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层
 *
 * @author zhangcb
 * @created 2017-05-23 12:54.
 */
@Service
public class UserInfoService {

    @Reference(version = "1.0.0")
    private UserService userService;
    @Reference(version = "1.0.0")
    private AddressService addressService;

    public UserInfoDTO findUserInfo(String name){
        UserDTO user = userService.findByName(name);
        UserInfoDTO dto = new UserInfoDTO();
        if(user != null){
            AddressDTO address = addressService.findByUserID(user.getId());
            dto.setAddress(address);
        }
        dto.setUser(user);
        return dto;
    }
}
