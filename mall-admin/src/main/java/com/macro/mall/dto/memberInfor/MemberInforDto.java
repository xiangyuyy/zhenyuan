package com.macro.mall.dto.memberInfor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


/**
 * 人员详情
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberInforDto {

    @ApiModelProperty(value = "基本信息")
    private MemberBaseInforDto memberBaseInforDto;

    @ApiModelProperty(value = "学历学位")
    private List<MemberEducationInforDto> memberEducationInforDtoList;

    @ApiModelProperty(value = "合同信息")
    private List<MemberWorkInforDto> memberWorkInforDtoList;

    @ApiModelProperty(value = "离退休信息")
    private List<MemberRetireWorkInforDto> memberRetireWorkInforDtoList;

    @ApiModelProperty(value = "离职信息")
    private List<MemberOutWorkInforDto> memberOutWorkInforDtos;

    @ApiModelProperty(value = "政治面貌")
    private List<MemberPoliticsInforDto> memberPoliticsInforDtoList;

    @ApiModelProperty(value = "药监职称")
    private List<MemberDrugInforDto> memberDrugInforDtoList;

}

