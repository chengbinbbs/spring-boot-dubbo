package com.chengbinbbs.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.chengbinbbs.api.entity.AddressDTO;
import com.chengbinbbs.api.service.AddressService;
import com.chengbinbbs.dao.AddressMapper;
import com.chengbinbbs.domain.Address;
import com.chengbinbbs.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 收货地址服务实现
 *
 * @author zhangcb
 * @created 2017-05-23 11:08.
 */
@Service(version = "1.0.0")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public AddressDTO findByUserID(Long userId) {
        Address address = addressMapper.findByUserID(userId);
        AddressDTO dto = new AddressDTO();
        BeanUtil.copyProperty(dto,address);
        return dto;
    }
}
