package com.macro.mall.msdao;

import com.macro.mall.model.Usra22;
import com.macro.mall.model.Usra22Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra22Mapper {
    long countByExample(Usra22Example example);

    int deleteByExample(Usra22Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra22 record);

    int insertSelective(Usra22 record);

    List<Usra22> selectByExample(Usra22Example example);

    Usra22 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra22 record, @Param("example") Usra22Example example);

    int updateByExample(@Param("record") Usra22 record, @Param("example") Usra22Example example);

    int updateByPrimaryKeySelective(Usra22 record);

    int updateByPrimaryKey(Usra22 record);
}