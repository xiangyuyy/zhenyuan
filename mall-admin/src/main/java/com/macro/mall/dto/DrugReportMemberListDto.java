package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 药监申报录入表 查询
 * Created by macro on 2018/4/26.
 */
@Data
public class DrugReportMemberListDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "人员id")
    private String memberId;

    @ApiModelProperty(value = "药监门店")
    private String drugShopName;

    @ApiModelProperty(value = "门店")
    private String shopName;



    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "出生年月")
    private Date birthday;

    @ApiModelProperty(value = "年龄")
    private Integer age;

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

    @ApiModelProperty(value = "药监学历")
    private String drugEducation;

    @ApiModelProperty(value = "药监专业")
    private String drugMajor;

    @ApiModelProperty(value = "职务或岗位1")
    private String drugPositionOne;

    @ApiModelProperty(value = "职务或岗位2")
    private String drugPositionTwo;

    @ApiModelProperty(value = "职务或岗位3")
    private String drugPositionThree;

    @ApiModelProperty(value = "职务或岗位集合")
    private String drugPositionAll;

    @ApiModelProperty(value = "参加专业工作时间")
    private Date workTime;

    @ApiModelProperty(value = "健康状况：0->不健康；1->健康")
    private Integer healthStatus;

    @ApiModelProperty(value = "是否继续教育：0->否；1->是")
    private Integer educationStatus;

    @ApiModelProperty(value = "是否参加培训：0->否；1->是")
    private Integer trainStatus;

}
