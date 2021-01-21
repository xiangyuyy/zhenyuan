package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 报表人员信息
 * Created by macro on 2018/4/26.
 */
@Data
public class ReportMemberListDto {


    @ApiModelProperty(value = "门店")
    private String shopName;

    @ApiModelProperty(value = "药监门店")
    private String drugShopName;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "性别")
    private String sex;

}
