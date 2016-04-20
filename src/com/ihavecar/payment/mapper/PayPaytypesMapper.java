package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayPaytypes;

public interface PayPaytypesMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(PayPaytypes record);

    int insertSelective(PayPaytypes record);

    PayPaytypes selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(PayPaytypes record);

    int updateByPrimaryKey(PayPaytypes record);
}