package com.chengbinbbs.controller;

import com.chengbinbbs.api.dto.AddressDTO;
import com.chengbinbbs.api.dto.UserDTO;
import com.chengbinbbs.api.service.AddressService;
import com.chengbinbbs.api.service.UserService;
import com.chengbinbbs.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制器
 *
 * @author zhangcb
 * @created 2017-05-22 18:27.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/user/{name}")
    @ResponseBody
    public UserInfoDTO findUserInfo(@PathVariable String name){
        UserInfoDTO dto = new UserInfoDTO();
        UserDTO user = userService.findByName(name);
        if(user != null){
            AddressDTO address = addressService.findByUserID(user.getId());
            dto.setAddress(address);
        }
        dto.setUser(user);
        return dto;
    }
}
