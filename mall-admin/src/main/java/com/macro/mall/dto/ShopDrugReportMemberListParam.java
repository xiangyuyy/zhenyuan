package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 部门变更录入
 * Created by macro on 2018/4/26.
 */
@Data
public class ShopDrugReportMemberListParam extends  ListParam{
    @ApiModelProperty(value = "门店id")
    private String shopId;
}
