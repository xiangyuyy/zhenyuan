package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 药监申报人员查询
 * Created by macro on 2018/4/26.
 */
@Data
public class AddReportMemberListParam extends  ListParam{
    @ApiModelProperty(value = "门店id")
    private String shopId;
    @ApiModelProperty(value = "reportId")
    private String reportId;
    @ApiModelProperty(value = "职称id")
    private String titleId;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "学历")
    private String educationId;
    @ApiModelProperty(value = "职务id")
    private String drugPositionId;
}
