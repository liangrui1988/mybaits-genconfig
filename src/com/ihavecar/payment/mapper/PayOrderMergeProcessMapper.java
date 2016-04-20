package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayOrderMergeProcess;

public interface PayOrderMergeProcessMapper {
    int deleteByPrimaryKey(String payOrderNo);

    int insert(PayOrderMergeProcess record);

    int insertSelective(PayOrderMergeProcess record);

    PayOrderMergeProcess selectByPrimaryKey(String payOrderNo);

    int updateByPrimaryKeySelective(PayOrderMergeProcess record);

    int updateByPrimaryKeyWithBLOBs(PayOrderMergeProcess record);

    int updateByPrimaryKey(PayOrderMergeProcess record);
}