package com.macro.mall.mapper;

import com.macro.mall.model.DrugReport;
import com.macro.mall.model.DrugReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugReportMapper {
    long countByExample(DrugReportExample example);

    int deleteByExample(DrugReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(DrugReport record);

    int insertSelective(DrugReport record);

    List<DrugReport> selectByExample(DrugReportExample example);

    DrugReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DrugReport record, @Param("example") DrugReportExample example);

    int updateByExample(@Param("record") DrugReport record, @Param("example") DrugReportExample example);

    int updateByPrimaryKeySelective(DrugReport record);

    int updateByPrimaryKey(DrugReport record);
}