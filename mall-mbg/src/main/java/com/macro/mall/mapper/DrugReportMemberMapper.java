package com.macro.mall.mapper;

import com.macro.mall.model.DrugReportMember;
import com.macro.mall.model.DrugReportMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugReportMemberMapper {
    long countByExample(DrugReportMemberExample example);

    int deleteByExample(DrugReportMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DrugReportMember record);

    int insertSelective(DrugReportMember record);

    List<DrugReportMember> selectByExample(DrugReportMemberExample example);

    DrugReportMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DrugReportMember record, @Param("example") DrugReportMemberExample example);

    int updateByExample(@Param("record") DrugReportMember record, @Param("example") DrugReportMemberExample example);

    int updateByPrimaryKeySelective(DrugReportMember record);

    int updateByPrimaryKey(DrugReportMember record);
}