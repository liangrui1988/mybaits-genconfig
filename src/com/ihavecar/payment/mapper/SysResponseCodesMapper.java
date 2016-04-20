package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.SysResponseCodes;

public interface SysResponseCodesMapper {
    int deleteByPrimaryKey(String code);

    int insert(SysResponseCodes record);

    int insertSelective(SysResponseCodes record);

    SysResponseCodes selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(SysResponseCodes record);

    int updateByPrimaryKeyWithBLOBs(SysResponseCodes record);

    int updateByPrimaryKey(SysResponseCodes record);
}