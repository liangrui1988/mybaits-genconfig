package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.SysTttplogs;

public interface SysTttplogsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysTttplogs record);

    int insertSelective(SysTttplogs record);

    SysTttplogs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysTttplogs record);

    int updateByPrimaryKeyWithBLOBs(SysTttplogs record);

    int updateByPrimaryKey(SysTttplogs record);
}