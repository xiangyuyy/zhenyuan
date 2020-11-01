package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DepartmentShopDto {
    @ApiModelProperty(value = "value")
    private String value;
    @ApiModelProperty(value = "组织名称")
    private String label;
    @ApiModelProperty(value = "parentId")
    private String parentId;
    @ApiModelProperty(value = "子类")
    private List<DepartmentShopDto> children = new ArrayList<DepartmentShopDto>();

    public DepartmentShopDto(String value, String label, String parentId) {
        this.value = value;
        this.label = label;
        this.parentId = parentId;
    }
}