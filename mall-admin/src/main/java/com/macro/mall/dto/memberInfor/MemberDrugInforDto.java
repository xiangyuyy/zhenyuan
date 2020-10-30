package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 药监职称
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberDrugInforDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "药监职称证书编号")
    private Date num;

    @ApiModelProperty(value = "药监职称时间")
    private Date time;

    @ApiModelProperty(value = "药监职称级别")
    private String kind;
}

