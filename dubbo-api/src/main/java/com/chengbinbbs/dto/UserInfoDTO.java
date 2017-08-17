package com.chengbinbbs.dto;

import com.chengbinbbs.api.entity.AddressDTO;
import com.chengbinbbs.api.entity.UserDTO;

import java.io.Serializable;

/**
 * 用户详情
 *
 * @author zhangcb
 * @created 2017-05-23 11:26.
 */
public class UserInfoDTO implements Serializable {

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
