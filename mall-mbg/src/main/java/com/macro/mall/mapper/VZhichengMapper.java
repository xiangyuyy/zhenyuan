package com.macro.mall.mapper;

import com.macro.mall.model.VZhicheng;
import com.macro.mall.model.VZhichengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VZhichengMapper {
    long countByExample(VZhichengExample example);

    int deleteByExample(VZhichengExample example);

    int insert(VZhicheng record);

    int insertSelective(VZhicheng record);

    List<VZhicheng> selectByExample(VZhichengExample example);

    int updateByExampleSelective(@Param("record") VZhicheng record, @Param("example") VZhichengExample example);

    int updateByExample(@Param("record") VZhicheng record, @Param("example") VZhichengExample example);
}