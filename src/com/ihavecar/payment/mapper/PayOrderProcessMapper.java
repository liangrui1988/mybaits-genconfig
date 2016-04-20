package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayOrderProcess;

public interface PayOrderProcessMapper {
    int deleteByPrimaryKey(String payOrderNo);

    int insert(PayOrderProcess record);

    int insertSelective(PayOrderProcess record);

    PayOrderProcess selectByPrimaryKey(String payOrderNo);

    int updateByPrimaryKeySelective(PayOrderProcess record);

    int updateByPrimaryKeyWithBLOBs(PayOrderProcess record);

    int updateByPrimaryKey(PayOrderProcess record);
}