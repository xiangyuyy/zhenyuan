package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 药监计算结果查询
 * Created by macro on 2018/4/26.
 */
@Data
public class DrugCountListParam extends  ListParam{
    @ApiModelProperty(value = "门店ids")
    private List<String> shopIds;
}
