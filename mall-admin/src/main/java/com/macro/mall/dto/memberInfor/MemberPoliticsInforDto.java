package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 政治面貌
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberPoliticsInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "参加党派时间")
    private Date time;

    @ApiModelProperty(value = "政治面貌")
    private String politics;

    @ApiModelProperty(value = "异常类别")
    private String status;
}

