package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayTranstion;

public interface PayTranstionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayTranstion record);

    int insertSelective(PayTranstion record);

    PayTranstion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayTranstion record);

    int updateByPrimaryKey(PayTranstion record);
}