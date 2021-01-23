package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 报表 高于编制 查询
 * Created by macro on 2018/4/26.
 */
@Data
public class VReportListParam extends  ListParam{
    @ApiModelProperty(value = "门店ids")
    private List<String> shopIds;
}
