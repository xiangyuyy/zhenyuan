package com.macro.mall.mapper;

import com.macro.mall.model.Usra66;
import com.macro.mall.model.Usra66Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra66Mapper {
    long countByExample(Usra66Example example);

    int deleteByExample(Usra66Example example);

    int insert(Usra66 record);

    int insertSelective(Usra66 record);

    List<Usra66> selectByExampleWithBLOBs(Usra66Example example);

    List<Usra66> selectByExample(Usra66Example example);

    int updateByExampleSelective(@Param("record") Usra66 record, @Param("example") Usra66Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra66 record, @Param("example") Usra66Example example);

    int updateByExample(@Param("record") Usra66 record, @Param("example") Usra66Example example);
}