package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 离退休信息
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberRetireWorkInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "离退类别")
    private String kind;

    @ApiModelProperty(value = "离退日期")
    private Date retireTime;

    @ApiModelProperty(value = "办理时间")
    private Date dealTime;

    @ApiModelProperty(value = "离退原因")
    private String mark;
}

