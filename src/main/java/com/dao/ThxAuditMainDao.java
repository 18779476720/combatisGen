package com.dao;

import com.model.ThxAuditMain;

public interface ThxAuditMainDao {
    int deleteByPrimaryKey(String auditId);

    int insert(ThxAuditMain record);

    int insertSelective(ThxAuditMain record);

    ThxAuditMain selectByPrimaryKey(String auditId);

    int updateByPrimaryKeySelective(ThxAuditMain record);

    int updateByPrimaryKey(ThxAuditMain record);
}