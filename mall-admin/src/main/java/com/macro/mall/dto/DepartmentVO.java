package com.macro.mall.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DepartmentVO {
    private String id;
    private String label;
    private List<DepartmentVO> children = new ArrayList<DepartmentVO>();

    public DepartmentVO(String id, String label,List<DepartmentVO> children) {
        this.id = id;
        this.label = label;
        this.children = children;
    }
}