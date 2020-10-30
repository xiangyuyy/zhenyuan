package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 人员详情
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberBaseInforDto {
    @ApiModelProperty(value = "人员id")
    private String id;

    @ApiModelProperty(value = "单位")
    private String company;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "参加工作时间")
    private Date workTime;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "名族")
    private String mingzu;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "户口所在地")
    private String adress;

    @ApiModelProperty(value = "户口性质")
    private String household;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "拼音简码")
    private String pyjm;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "人员类别")
    private String pkind;

    @ApiModelProperty(value = "到本单位时间")
    private Date getWorkTime;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "人员编码")
    private String pnum;

    @ApiModelProperty(value = "最高学历")
    private String education;

    @ApiModelProperty(value = "现住址")
    private String nowAdress;

    @ApiModelProperty(value = "备注")
    private String mark;
}

