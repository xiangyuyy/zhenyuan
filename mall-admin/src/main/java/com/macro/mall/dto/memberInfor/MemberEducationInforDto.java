package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 学历学位
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberEducationInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "学历性质")
    private String kind;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "毕业学校")
    private String school;

    @ApiModelProperty(value = "所学专业")
    private String major;

    @ApiModelProperty(value = "是否管理")
    private String isManager;

    @ApiModelProperty(value = "是否最高学历")
    private String isHigh;

    @ApiModelProperty(value = "所学专业（描述）")
    private String decs;
}

