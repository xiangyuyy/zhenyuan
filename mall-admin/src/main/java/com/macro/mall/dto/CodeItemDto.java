package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 基础数据集
 * Created by macro on 2018/4/26.
 */
@Data
public class CodeItemDto {

    @ApiModelProperty(value = "宏景字段-AM")
    private String codesetid;

    @ApiModelProperty(value = "代码")
    private String codeitemid;

    @ApiModelProperty(value = "名称")
    private String codeitemdesc;

    @ApiModelProperty(value = "拼音码")
    private String pycode;

}
