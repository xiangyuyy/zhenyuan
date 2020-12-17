package com.macro.mall.mapper;

import com.macro.mall.model.Yjjg;
import com.macro.mall.model.YjjgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YjjgMapper {
    long countByExample(YjjgExample example);

    int deleteByExample(YjjgExample example);

    int insert(Yjjg record);

    int insertSelective(Yjjg record);

    List<Yjjg> selectByExample(YjjgExample example);

    int updateByExampleSelective(@Param("record") Yjjg record, @Param("example") YjjgExample example);

    int updateByExample(@Param("record") Yjjg record, @Param("example") YjjgExample example);
}