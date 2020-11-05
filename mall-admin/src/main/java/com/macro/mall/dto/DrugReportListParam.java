package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 药监申报录入申报控制台
 * Created by macro on 2018/4/26.
 */
@Data
public class DrugReportListParam extends  ListParam{
    @ApiModelProperty(value = "单号")
    private String reportId;

    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "审核状态：-1->待确定（前段不需要）;0->待审核；1->审核通过")
    private Integer checkStatus;

    @ApiModelProperty(value = "操作人id")
    private String operatorId;

    @ApiModelProperty(value = "部门申报建立  日期开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reportTimeBegin;

    @ApiModelProperty(value = "部门申报建立  日期结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reportTimeEnd;
}
