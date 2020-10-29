package com.macro.mall.msdao;

import com.macro.mall.model.VZhicheng;
import com.macro.mall.model.VZhichengExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYVZhichengMapper {
    long countByExample(VZhichengExample example);

    int deleteByExample(VZhichengExample example);

    int insert(VZhicheng record);

    int insertSelective(VZhicheng record);

    List<VZhicheng> selectByExample(VZhichengExample example);

    int updateByExampleSelective(@Param("record") VZhicheng record, @Param("example") VZhichengExample example);

    int updateByExample(@Param("record") VZhicheng record, @Param("example") VZhichengExample example);
}