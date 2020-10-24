package com.macro.mall.msdao;

import com.macro.mall.model.Usra64;
import com.macro.mall.model.Usra64Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra64Mapper {
    long countByExample(Usra64Example example);

    int deleteByExample(Usra64Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra64 record);

    int insertSelective(Usra64 record);

    List<Usra64> selectByExampleWithBLOBs(Usra64Example example);

    List<Usra64> selectByExample(Usra64Example example);

    Usra64 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra64 record, @Param("example") Usra64Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra64 record, @Param("example") Usra64Example example);

    int updateByExample(@Param("record") Usra64 record, @Param("example") Usra64Example example);

    int updateByPrimaryKeySelective(Usra64 record);

    int updateByPrimaryKeyWithBLOBs(Usra64 record);

    int updateByPrimaryKey(Usra64 record);
}