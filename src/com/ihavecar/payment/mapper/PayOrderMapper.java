package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayOrder;
import com.ihavecar.payment.entity.PayOrderKey;

public interface PayOrderMapper {
    int deleteByPrimaryKey(PayOrderKey key);

    int insert(PayOrder record);

    int insertSelective(PayOrder record);

    PayOrder selectByPrimaryKey(PayOrderKey key);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKey(PayOrder record);
}