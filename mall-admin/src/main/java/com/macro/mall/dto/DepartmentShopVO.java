package com.macro.mall.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DepartmentShopVO {
    private String value;
    private String label;
    private List<DepartmentShopDto> children = new ArrayList();

    public DepartmentShopVO(String value, String label, List<DepartmentShopDto> children) {
        this.value = value;
        this.label = label;
        this.children = children;
    }
}