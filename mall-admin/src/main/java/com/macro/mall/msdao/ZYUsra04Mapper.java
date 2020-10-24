package com.macro.mall.msdao;

import com.macro.mall.model.Usra04;
import com.macro.mall.model.Usra04Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra04Mapper {
    long countByExample(Usra04Example example);

    int deleteByExample(Usra04Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra04 record);

    int insertSelective(Usra04 record);

    List<Usra04> selectByExample(Usra04Example example);

    Usra04 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra04 record, @Param("example") Usra04Example example);

    int updateByExample(@Param("record") Usra04 record, @Param("example") Usra04Example example);

    int updateByPrimaryKeySelective(Usra04 record);

    int updateByPrimaryKey(Usra04 record);
}