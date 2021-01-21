package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 报表 3个虚挂人员查询
 * Created by macro on 2018/4/26.
 */
@Data
public class ReportMemberListParam extends  ListParam{
    @ApiModelProperty(value = "门店id")
    private String shopId;
}
