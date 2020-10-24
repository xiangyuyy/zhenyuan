package com.macro.mall.mapper;

import com.macro.mall.model.Codeitem;
import com.macro.mall.model.CodeitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeitemMapper {
    long countByExample(CodeitemExample example);

    int deleteByExample(CodeitemExample example);

    int insert(Codeitem record);

    int insertSelective(Codeitem record);

    List<Codeitem> selectByExample(CodeitemExample example);

    int updateByExampleSelective(@Param("record") Codeitem record, @Param("example") CodeitemExample example);

    int updateByExample(@Param("record") Codeitem record, @Param("example") CodeitemExample example);
}