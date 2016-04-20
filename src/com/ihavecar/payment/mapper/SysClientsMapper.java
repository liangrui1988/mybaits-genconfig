package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.SysClients;
import com.ihavecar.payment.entity.SysClientsKey;

public interface SysClientsMapper {
    int deleteByPrimaryKey(SysClientsKey key);

    int insert(SysClients record);

    int insertSelective(SysClients record);

    SysClients selectByPrimaryKey(SysClientsKey key);

    int updateByPrimaryKeySelective(SysClients record);

    int updateByPrimaryKey(SysClients record);
}