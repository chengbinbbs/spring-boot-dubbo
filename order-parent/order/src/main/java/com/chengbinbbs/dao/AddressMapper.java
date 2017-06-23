package com.chengbinbbs.dao;

import com.chengbinbbs.domain.Address;

/**
 * @author zhangcb
 * @created on 2017/5/15.
 */
public interface AddressMapper {

    Address findByUserID(Long userId);
}
