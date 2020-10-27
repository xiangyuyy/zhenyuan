package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DepartmentDto {
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "组织名称")
    private String label;
    @ApiModelProperty(value = "parentId")
    private String parentId;
    @ApiModelProperty(value = "子类")
    private List<DepartmentDto> children = new ArrayList<DepartmentDto>();

    public DepartmentDto(String id, String label, String parentId) {
        this.id = id;
        this.label = label;
        this.parentId = parentId;
    }
}