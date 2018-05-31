package com.dao;

import com.model.ThxInqMatchLog;

public interface ThxInqMatchLogDao {
    int deleteByPrimaryKey(String matchId);

    int insert(ThxInqMatchLog record);

    int insertSelective(ThxInqMatchLog record);

    ThxInqMatchLog selectByPrimaryKey(String matchId);

    int updateByPrimaryKeySelective(ThxInqMatchLog record);

    int updateByPrimaryKey(ThxInqMatchLog record);
}