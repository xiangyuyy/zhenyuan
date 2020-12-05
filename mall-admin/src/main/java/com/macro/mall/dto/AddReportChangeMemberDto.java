package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


/**
 * 部门变更添加人员
 * Created by macro on 2018/4/26.
 */
@Data
public class AddReportChangeMemberDto {

    @ApiModelProperty(value = "reportId-单号")
    private String reportId;

    @ApiModelProperty(value = "变更原因")
    private String changeReason;

    @ApiModelProperty(value = "新增人员id列表 支持全选")
    private List<String> memberIds;
}
