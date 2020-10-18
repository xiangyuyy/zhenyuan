package com.macro.mall.msdao;

import java.util.List;

import com.macro.mall.msmodel.Test;
import com.macro.mall.msmodel.TestExample;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);
}