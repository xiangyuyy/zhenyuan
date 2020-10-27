package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


/**
 * 药监新增人员
 * Created by macro on 2018/4/26.
 */
@Data
public class AddReportMemberDto {

    @ApiModelProperty(value = "reportId-单号")
    private String reportId;

    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "新增人员id列表 支持全选")
    private List<String> memberIds;
}
