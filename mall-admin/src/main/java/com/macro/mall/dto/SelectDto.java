package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 下拉选择
 * Created by macro on 2018/4/26.
 */
@Data
public class SelectDto {
    private String value;
    private String label;
}
