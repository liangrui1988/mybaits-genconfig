package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayNotify;
import com.ihavecar.payment.entity.PayNotifyWithBLOBs;

public interface PayNotifyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayNotifyWithBLOBs record);

    int insertSelective(PayNotifyWithBLOBs record);

    PayNotifyWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayNotifyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PayNotifyWithBLOBs record);

    int updateByPrimaryKey(PayNotify record);
}