package com.macro.mall.mapper;

import com.macro.mall.model.VReport;
import com.macro.mall.model.VReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VReportMapper {
    long countByExample(VReportExample example);

    int deleteByExample(VReportExample example);

    int insert(VReport record);

    int insertSelective(VReport record);

    List<VReport> selectByExample(VReportExample example);

    int updateByExampleSelective(@Param("record") VReport record, @Param("example") VReportExample example);

    int updateByExample(@Param("record") VReport record, @Param("example") VReportExample example);
}