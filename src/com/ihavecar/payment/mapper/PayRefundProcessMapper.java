package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayRefundProcess;

public interface PayRefundProcessMapper {
    int deleteByPrimaryKey(String refundPayNo);

    int insert(PayRefundProcess record);

    int insertSelective(PayRefundProcess record);

    PayRefundProcess selectByPrimaryKey(String refundPayNo);

    int updateByPrimaryKeySelective(PayRefundProcess record);

    int updateByPrimaryKeyWithBLOBs(PayRefundProcess record);

    int updateByPrimaryKey(PayRefundProcess record);
}