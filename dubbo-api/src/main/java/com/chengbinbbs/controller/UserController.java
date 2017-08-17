package com.chengbinbbs.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chengbinbbs.api.entity.AddressDTO;
import com.chengbinbbs.api.entity.UserDTO;
import com.chengbinbbs.api.service.AddressService;
import com.chengbinbbs.api.service.UserService;
import com.chengbinbbs.dto.UserInfoDTO;
import com.chengbinbbs.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author zhangcb
 * @created 2017-05-23 11:24.
 */
@RestController
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/user/{name}")
    public UserInfoDTO findByName(@PathVariable String name){
        return userInfoService.findUserInfo(name);
    }
}
