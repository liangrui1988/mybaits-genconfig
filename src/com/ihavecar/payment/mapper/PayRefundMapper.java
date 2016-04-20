package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayRefund;
import com.ihavecar.payment.entity.PayRefundKey;

public interface PayRefundMapper {
    int deleteByPrimaryKey(PayRefundKey key);

    int insert(PayRefund record);

    int insertSelective(PayRefund record);

    PayRefund selectByPrimaryKey(PayRefundKey key);

    int updateByPrimaryKeySelective(PayRefund record);

    int updateByPrimaryKey(PayRefund record);
}