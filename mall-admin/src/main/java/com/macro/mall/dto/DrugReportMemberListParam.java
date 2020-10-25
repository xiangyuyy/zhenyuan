package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 药监申报录入表查询
 * Created by macro on 2018/4/26.
 */
@Data
public class DrugReportMemberListParam extends  ListParam{
    @ApiModelProperty(value = "单号id")
    private String reportId;
}
