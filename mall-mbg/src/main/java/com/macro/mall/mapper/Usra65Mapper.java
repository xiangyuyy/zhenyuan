package com.macro.mall.mapper;

import com.macro.mall.model.Usra65;
import com.macro.mall.model.Usra65Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra65Mapper {
    long countByExample(Usra65Example example);

    int deleteByExample(Usra65Example example);

    int insert(Usra65 record);

    int insertSelective(Usra65 record);

    List<Usra65> selectByExampleWithBLOBs(Usra65Example example);

    List<Usra65> selectByExample(Usra65Example example);

    int updateByExampleSelective(@Param("record") Usra65 record, @Param("example") Usra65Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra65 record, @Param("example") Usra65Example example);

    int updateByExample(@Param("record") Usra65 record, @Param("example") Usra65Example example);
}