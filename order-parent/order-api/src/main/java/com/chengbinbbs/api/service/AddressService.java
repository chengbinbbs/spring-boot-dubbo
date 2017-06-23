package com.chengbinbbs.api.service;

import com.chengbinbbs.api.dto.AddressDTO;

/**
 * @author zhangcb
 * @created on 2017/5/22.
 */
public interface AddressService {

    AddressDTO findByUserID(Long userId);
}
