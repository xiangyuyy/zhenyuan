package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 人员查询
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberListParam  extends  ListParam{
    @ApiModelProperty(value = "门店ids")
    private List<String> shopIds;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "职称ids")
    private List<String>  titleIds;
    @ApiModelProperty(value = "专业")
    private String major;
    @ApiModelProperty(value = "职务id")
    private String drugPositionId;
    @ApiModelProperty(value = "药监门店是否为空 0 空 1 不为空")
    private String isNullDrugShopId;

    @ApiModelProperty(value = "药监门店ids")
    private List<String> drugShopIds;

    @ApiModelProperty(value = "药监学历id")
    private String drugEducationId;

    @ApiModelProperty(value = "药监专业id")
    private String drugMajorId;

    @ApiModelProperty(value = "学历")
    private String educationId;

    @ApiModelProperty(value = "人员类别")
    private String peopleKindId;
}
