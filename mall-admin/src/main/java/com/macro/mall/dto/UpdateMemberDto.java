package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 人员信息更新
 * Created by macro on 2018/4/26.
 */
@Data
public class UpdateMemberDto {
    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "药监门店id")
    private String drugShopId;

    @ApiModelProperty(value = "药监上报职称")
    private String drugTitleId;

    @ApiModelProperty(value = "药监编制职称")
    private String drugOrgId;

    @ApiModelProperty(value = "学历")
    private String educationId;

    @ApiModelProperty(value = "药监学历")

    private String drugEducationId;

    @ApiModelProperty(value = "药监专业")
    private String drugMajorId;

    @ApiModelProperty(value = "药监学校")
    private String drugSchool;

    @ApiModelProperty(value = "职务或岗位1")
    private String drugPositionOneId;

    @ApiModelProperty(value = "职务或岗位2")
    private String drugPositionTwoId;

    @ApiModelProperty(value = "职务或岗位3")
    private String drugPositionThreeId;

    @ApiModelProperty(value = "参加专业工作时间")
    private Date workTime;

}
