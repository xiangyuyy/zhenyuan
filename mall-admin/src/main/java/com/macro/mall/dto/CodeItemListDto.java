package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 基础数据集
 * Created by macro on 2018/4/26.
 */
@Data
public class CodeItemListDto {

    @ApiModelProperty(value = "描述")
    private String title;

    @ApiModelProperty(value = "key")
    private String key;

}
