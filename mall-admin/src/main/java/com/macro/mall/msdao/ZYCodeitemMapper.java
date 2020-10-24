package com.macro.mall.msdao;

import com.macro.mall.model.Codeitem;
import com.macro.mall.model.CodeitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZYCodeitemMapper {
    long countByExample(CodeitemExample example);

    int deleteByExample(CodeitemExample example);

    int insert(Codeitem record);

    int insertSelective(Codeitem record);

    List<Codeitem> selectByExample(CodeitemExample example);

    int updateByExampleSelective(@Param("record") Codeitem record, @Param("example") CodeitemExample example);

    int updateByExample(@Param("record") Codeitem record, @Param("example") CodeitemExample example);
}