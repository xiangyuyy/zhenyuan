package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 返聘信息
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberBackWorkInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "返聘单位")
    private String company;

    @ApiModelProperty(value = "返聘类型")
    private String kind;

    @ApiModelProperty(value = "返聘岗位")
    private String work;

    @ApiModelProperty(value = "返聘起始时间")
    private Date beginTime;

    @ApiModelProperty(value = "返聘终止时间")
    private Date endTime;

    @ApiModelProperty(value = "离退原因")
    private String reason;
}

