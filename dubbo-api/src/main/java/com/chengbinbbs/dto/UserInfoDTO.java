package com.chengbinbbs.dto;

import com.chengbinbbs.api.dto.AddressDTO;
import com.chengbinbbs.api.dto.UserDTO;

import java.io.Serializable;

/**
 * 用户详情
 *
 * @author zhangcb
 * @created 2017-05-22 18:31.
 */
public class UserInfoDTO implements Serializable{

    private UserDTO user;

    private AddressDTO address;

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
