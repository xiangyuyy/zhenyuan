package com.macro.mall.mapper;

import com.macro.mall.model.Usra04;
import com.macro.mall.model.Usra04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra04Mapper {
    long countByExample(Usra04Example example);

    int deleteByExample(Usra04Example example);

    int insert(Usra04 record);

    int insertSelective(Usra04 record);

    List<Usra04> selectByExample(Usra04Example example);

    int updateByExampleSelective(@Param("record") Usra04 record, @Param("example") Usra04Example example);

    int updateByExample(@Param("record") Usra04 record, @Param("example") Usra04Example example);
}