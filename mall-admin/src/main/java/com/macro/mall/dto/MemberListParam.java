package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 人员查询
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberListParam  extends  ListParam{
    @ApiModelProperty(value = "门店id")
    private String shop_id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "职称id")
    private String title_id;
    @ApiModelProperty(value = "专业")
    private String major;
    @ApiModelProperty(value = "职务id")
    private String drugPosition_id;
}
