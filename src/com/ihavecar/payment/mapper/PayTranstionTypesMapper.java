package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayTranstionTypes;

public interface PayTranstionTypesMapper {
    int deleteByPrimaryKey(Integer type);

    int insert(PayTranstionTypes record);

    int insertSelective(PayTranstionTypes record);

    PayTranstionTypes selectByPrimaryKey(Integer type);

    int updateByPrimaryKeySelective(PayTranstionTypes record);

    int updateByPrimaryKey(PayTranstionTypes record);
}