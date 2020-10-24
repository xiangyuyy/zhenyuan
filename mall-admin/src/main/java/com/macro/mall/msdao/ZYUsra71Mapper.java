package com.macro.mall.msdao;

import com.macro.mall.model.Usra71;
import com.macro.mall.model.Usra71Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYUsra71Mapper {
    long countByExample(Usra71Example example);

    int deleteByExample(Usra71Example example);

    int deleteByPrimaryKey(String a0100);

    int insert(Usra71 record);

    int insertSelective(Usra71 record);

    List<Usra71> selectByExample(Usra71Example example);

    Usra71 selectByPrimaryKey(String a0100);

    int updateByExampleSelective(@Param("record") Usra71 record, @Param("example") Usra71Example example);

    int updateByExample(@Param("record") Usra71 record, @Param("example") Usra71Example example);

    int updateByPrimaryKeySelective(Usra71 record);

    int updateByPrimaryKey(Usra71 record);
}