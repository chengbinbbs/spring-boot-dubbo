package com.chengbinbbs.apigw.service;

import com.chengbinbbs.api.entity.AddressDTO;

/**
 * @author zhangcb
 * @created on 2017/5/22.
 */
public interface AddressService {

    AddressDTO findByUserID(Long userId);
}
