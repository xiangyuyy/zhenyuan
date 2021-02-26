package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 导出所有人员
 * Created by macro on 2018/4/26.
 */
@Data
public class ReportDrugCountDto {
    @ApiModelProperty(value = "门店")
    private String shopName;

    @ApiModelProperty(value = "行政隶属：1->市区；2->乡镇；3->村")
    private String subjection;

    @ApiModelProperty(value = "有无中药：0->无；1->有")
    private String chineseMedicine;

    @ApiModelProperty(value = "是否远程：0->无；1->有")
    private String longRange;

    @ApiModelProperty(value = "经营面积")
    private BigDecimal area;

    @ApiModelProperty(value = "执业药师")
    private Integer praPharmacist;

    @ApiModelProperty(value = "执业中药师")
    private Integer praChinesePharmacist;

    @ApiModelProperty(value = "药师")
    private Integer pharmacist;

    @ApiModelProperty(value = "技工")
    private Integer mechanic;
}
