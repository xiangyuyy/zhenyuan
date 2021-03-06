package com.macro.mall.mapper;

import com.macro.mall.model.Usra71;
import com.macro.mall.model.Usra71Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra71Mapper {
    long countByExample(Usra71Example example);

    int deleteByExample(Usra71Example example);

    int insert(Usra71 record);

    int insertSelective(Usra71 record);

    List<Usra71> selectByExample(Usra71Example example);

    int updateByExampleSelective(@Param("record") Usra71 record, @Param("example") Usra71Example example);

    int updateByExample(@Param("record") Usra71 record, @Param("example") Usra71Example example);
}