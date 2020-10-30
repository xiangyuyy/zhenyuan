package com.macro.mall.mapper;

import com.macro.mall.model.Usra64;
import com.macro.mall.model.Usra64Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Usra64Mapper {
    long countByExample(Usra64Example example);

    int deleteByExample(Usra64Example example);

    int insert(Usra64 record);

    int insertSelective(Usra64 record);

    List<Usra64> selectByExampleWithBLOBs(Usra64Example example);

    List<Usra64> selectByExample(Usra64Example example);

    int updateByExampleSelective(@Param("record") Usra64 record, @Param("example") Usra64Example example);

    int updateByExampleWithBLOBs(@Param("record") Usra64 record, @Param("example") Usra64Example example);

    int updateByExample(@Param("record") Usra64 record, @Param("example") Usra64Example example);
}