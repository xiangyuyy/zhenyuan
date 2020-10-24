package com.macro.mall.mapper;

import com.macro.mall.model.MemberRecord;
import com.macro.mall.model.MemberRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberRecordMapper {
    long countByExample(MemberRecordExample example);

    int deleteByExample(MemberRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberRecord record);

    int insertSelective(MemberRecord record);

    List<MemberRecord> selectByExample(MemberRecordExample example);

    MemberRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberRecord record, @Param("example") MemberRecordExample example);

    int updateByExample(@Param("record") MemberRecord record, @Param("example") MemberRecordExample example);

    int updateByPrimaryKeySelective(MemberRecord record);

    int updateByPrimaryKey(MemberRecord record);
}