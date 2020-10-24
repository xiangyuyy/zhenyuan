package com.macro.mall.msdao;

import com.macro.mall.model.Usra66;
import com.macro.mall.model.Usra66Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra66Mapper {
    long countByExample(Usra66Example example);

    int deleteByExample(Usra66Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra66 record);

    int insertSelective(Usra66 record);

    List<Usra66> selectByExampleWithBLOBs(Usra66Example example);

    List<Usra66> selectByExample(Usra66Example example);

    Usra66 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra66 record, @Param("example") Usra66Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra66 record, @Param("example") Usra66Example example);

    int updateByExample(@Param("record") Usra66 record, @Param("example") Usra66Example example);

    int updateByPrimaryKeySelective(Usra66 record);

    int updateByPrimaryKeyWithBLOBs(Usra66 record);

    int updateByPrimaryKey(Usra66 record);
}