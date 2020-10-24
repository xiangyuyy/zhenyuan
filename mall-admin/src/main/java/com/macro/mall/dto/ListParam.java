package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 分页
 * Created by macro on 2018/4/26.
 */
@Data
public class ListParam {
    @ApiModelProperty(value = "第几页")
    private Integer pageNum;
    @ApiModelProperty(value = "每页记录数")
    private Integer pageSize;
}
