package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 药监申报录入表 普通导出
 * Created by macro on 2018/4/26.
 */

@Data
public class ExportDrugReportMemberDto {

    @ApiModelProperty(value = "排列序号")
    private Integer sort;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "出生年月")
    private String birthday;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "药监上报职称")
    private String drugTitle;

    @ApiModelProperty(value = "药监学历")
    private String drugEducation;

    @ApiModelProperty(value = "药监专业")
    private String drugMajor;

    @ApiModelProperty(value = "职务或岗位集合")
    private String drugPositionAll;

    @ApiModelProperty(value = "参加专业工作时间")
    private String workTime;

    @ApiModelProperty(value = "健康状况：0->不健康；1->健康")
    private String healthStatus;

    @ApiModelProperty(value = "是否继续教育：0->否；1->是")
    private String educationStatus;

    @ApiModelProperty(value = "是否参加培训：0->否；1->是")
    private String trainStatus;


}
