package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 药监申报录入控制台
 * Created by macro on 2018/4/26.
 */
@Data
public class DrugReportListDto {

    @ApiModelProperty(value = "单号")
    private String id;

    @ApiModelProperty(value = "门店")
    private String shopName;

    @ApiModelProperty(value = "shopId")
    private String shopId;

    @ApiModelProperty(value = "审核状态：-1->待确定;0->待审核；1->审核通过")
    private Integer checkStatus;

    @ApiModelProperty(value = "操作人")
    private String operatorName;

    @ApiModelProperty(value = "部门申报建立时间")
    private Date reportTime;

    @ApiModelProperty(value = "是否存在提交变更")
    private Integer IsChange;

}
