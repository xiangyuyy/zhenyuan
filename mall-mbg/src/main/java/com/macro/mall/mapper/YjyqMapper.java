package com.macro.mall.mapper;

import com.macro.mall.model.Yjyq;
import com.macro.mall.model.YjyqExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YjyqMapper {
    long countByExample(YjyqExample example);

    int deleteByExample(YjyqExample example);

    int insert(Yjyq record);

    int insertSelective(Yjyq record);

    List<Yjyq> selectByExample(YjyqExample example);

    int updateByExampleSelective(@Param("record") Yjyq record, @Param("example") YjyqExample example);

    int updateByExample(@Param("record") Yjyq record, @Param("example") YjyqExample example);
}