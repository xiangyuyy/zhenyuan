package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 离职信息
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberOutWorkInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "离职日期")
    private Date outTime;

    @ApiModelProperty(value = "离职原因")
    private String reason;

    @ApiModelProperty(value = "离职前类别")
    private String kind;

    @ApiModelProperty(value = "离职说明")
    private String mark;
}

