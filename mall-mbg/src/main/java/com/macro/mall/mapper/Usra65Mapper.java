package com.macro.mall.mapper;

import com.macro.mall.model.Usra65;
import com.macro.mall.model.Usra65Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra65Mapper {
    long countByExample(Usra65Example example);

    int deleteByExample(Usra65Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra65 record);

    int insertSelective(Usra65 record);

    List<Usra65> selectByExampleWithBLOBs(Usra65Example example);

    List<Usra65> selectByExample(Usra65Example example);

    Usra65 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra65 record, @Param("example") Usra65Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra65 record, @Param("example") Usra65Example example);

    int updateByExample(@Param("record") Usra65 record, @Param("example") Usra65Example example);

    int updateByPrimaryKeySelective(Usra65 record);

    int updateByPrimaryKeyWithBLOBs(Usra65 record);

    int updateByPrimaryKey(Usra65 record);
}