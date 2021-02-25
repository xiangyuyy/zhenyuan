package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 部门申报变更记录查询
 * Created by macro on 2018/4/26.
 */
@Data
public class ShopMemberRecordListParam extends ListParam {

    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "变更原因")
    private String changeReason;

    @ApiModelProperty(value = "变更日期  日期开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeBegin;

    @ApiModelProperty(value = "变更日期  日期结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeEnd;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "memberIds")
    private List<String> memberIds;
}
