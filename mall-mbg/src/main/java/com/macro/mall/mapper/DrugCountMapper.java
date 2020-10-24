package com.macro.mall.mapper;

import com.macro.mall.model.DrugCount;
import com.macro.mall.model.DrugCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugCountMapper {
    long countByExample(DrugCountExample example);

    int deleteByExample(DrugCountExample example);

    int deleteByPrimaryKey(String shopId);

    int insert(DrugCount record);

    int insertSelective(DrugCount record);

    List<DrugCount> selectByExample(DrugCountExample example);

    DrugCount selectByPrimaryKey(String shopId);

    int updateByExampleSelective(@Param("record") DrugCount record, @Param("example") DrugCountExample example);

    int updateByExample(@Param("record") DrugCount record, @Param("example") DrugCountExample example);

    int updateByPrimaryKeySelective(DrugCount record);

    int updateByPrimaryKey(DrugCount record);
}