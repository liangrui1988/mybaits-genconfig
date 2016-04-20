package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayOrderMerge;
import com.ihavecar.payment.entity.PayOrderMergeKey;

public interface PayOrderMergeMapper {
    int deleteByPrimaryKey(PayOrderMergeKey key);

    int insert(PayOrderMerge record);

    int insertSelective(PayOrderMerge record);

    PayOrderMerge selectByPrimaryKey(PayOrderMergeKey key);

    int updateByPrimaryKeySelective(PayOrderMerge record);

    int updateByPrimaryKey(PayOrderMerge record);
}