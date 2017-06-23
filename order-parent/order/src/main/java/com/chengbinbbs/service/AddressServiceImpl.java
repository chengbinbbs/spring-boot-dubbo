package com.chengbinbbs.service;

import com.chengbinbbs.api.dto.AddressDTO;
import com.chengbinbbs.api.service.AddressService;
import com.chengbinbbs.dao.AddressMapper;
import com.chengbinbbs.domain.Address;
import com.chengbinbbs.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 地址服务实现
 *
 * @author zhangcb
 * @created 2017-05-22 13:47.
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressMapper addressMapper;

    public AddressDTO findByUserID(Long userId) {
        Address address = addressMapper.findByUserID(userId);
        AddressDTO dto = new AddressDTO();
        BeanUtil.copyProperty(dto,address);
        return dto;
    }
}
