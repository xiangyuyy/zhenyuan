package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 药监新增人员查询
 * Created by macro on 2018/4/26.
 */
@Data
public class AddReportMemberListDto {

    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "虚拟挂职药店")
    private String drugShopName;

    @ApiModelProperty(value = "门店")
    private String shopName;

    @ApiModelProperty(value = "姓名")
    private String name;


    @ApiModelProperty(value = "职称")
    private String title;

    @ApiModelProperty(value = "获得职称时间")
    private Date titleTime;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "专业")
    private String major;


    @ApiModelProperty(value = "药监上报职称")
    private String drugTitle;

    @ApiModelProperty(value = "药监编制职称")
    private String drugOrg;

    @ApiModelProperty(value = "职务或岗位1")
    private String drugPositionOne;

    @ApiModelProperty(value = "职务或岗位2")
    private String drugPositionTwo;

    @ApiModelProperty(value = "职务或岗位3")
    private String drugPositionThree;

}
