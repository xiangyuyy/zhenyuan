package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 合同信息
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberWorkInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "合同起始时间")
    private String beginTime;

    @ApiModelProperty(value = "合同终止时间")
    private Date endTime;

    @ApiModelProperty(value = "实际终止时间")
    private Date sjEndTime;

    @ApiModelProperty(value = "合同备注")
    private String mark;

}

