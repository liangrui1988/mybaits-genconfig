package com.ihavecar.payment.mapper;

import com.ihavecar.payment.entity.SysLogs;
import com.ihavecar.payment.entity.SysLogsWithBLOBs;

public interface SysLogsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLogsWithBLOBs record);

    int insertSelective(SysLogsWithBLOBs record);

    SysLogsWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLogsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogsWithBLOBs record);

    int updateByPrimaryKey(SysLogs record);
}