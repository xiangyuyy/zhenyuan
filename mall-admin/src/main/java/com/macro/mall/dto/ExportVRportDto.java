package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


/**
 * 高于编制导出
 * Created by macro on 2018/4/26.
 */

@Data
public class ExportVRportDto {

    @ApiModelProperty(value = "门店")
    private String shopname;

    @ApiModelProperty(value = "行政隶属：1->市区；2->乡镇；3->村")
    private String subjection;

    @ApiModelProperty(value = "有无中药：0->无；1->有")
    private String chineseMedicine;

    @ApiModelProperty(value = "是否远程：0->无；1->有")
    private String longRange;

    @ApiModelProperty(value = "经营面积")
    private BigDecimal area;

    @ApiModelProperty(value = "编制要求职称")
    private String type;

    @ApiModelProperty(value = "编制要求职称对应人数")
    private Integer num;

    @ApiModelProperty(value = "实际配置人数")
    private Long nownum;

    @ApiModelProperty(value = "差异")
    private Long diff;
}
