package com.dao;

import com.model.ThxAuditInfos;

public interface ThxAuditInfosDao {
    int deleteByPrimaryKey(String auditInfoid);

    int insert(ThxAuditInfos record);

    int insertSelective(ThxAuditInfos record);

    ThxAuditInfos selectByPrimaryKey(String auditInfoid);

    int updateByPrimaryKeySelective(ThxAuditInfos record);

    int updateByPrimaryKey(ThxAuditInfos record);
}