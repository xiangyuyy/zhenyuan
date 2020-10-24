package com.macro.mall.msdao;

import com.macro.mall.model.Usra01;
import com.macro.mall.model.Usra01Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra01Mapper {
    long countByExample(Usra01Example example);

    int deleteByExample(Usra01Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra01 record);

    int insertSelective(Usra01 record);

    List<Usra01> selectByExampleWithBLOBs(Usra01Example example);

    List<Usra01> selectByExample(Usra01Example example);

    Usra01 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra01 record, @Param("example") Usra01Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra01 record, @Param("example") Usra01Example example);

    int updateByExample(@Param("record") Usra01 record, @Param("example") Usra01Example example);

    int updateByPrimaryKeySelective(Usra01 record);

    int updateByPrimaryKeyWithBLOBs(Usra01 record);

    int updateByPrimaryKey(Usra01 record);
}