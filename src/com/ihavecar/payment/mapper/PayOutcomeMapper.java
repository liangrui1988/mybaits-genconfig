package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.PayOutcome;

public interface PayOutcomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayOutcome record);

    int insertSelective(PayOutcome record);

    PayOutcome selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayOutcome record);

    int updateByPrimaryKey(PayOutcome record);
}