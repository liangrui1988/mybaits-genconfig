package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayIncome;

public interface PayIncomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayIncome record);

    int insertSelective(PayIncome record);

    PayIncome selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayIncome record);

    int updateByPrimaryKey(PayIncome record);
}