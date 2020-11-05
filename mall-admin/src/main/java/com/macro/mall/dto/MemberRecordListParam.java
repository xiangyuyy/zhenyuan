package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 变更历史查询
 * Created by macro on 2018/4/26.
 */
@Data
public class MemberRecordListParam extends  ListParam{

    @ApiModelProperty(value = "人员memberId")
    private String memberId;

    @ApiModelProperty(value = "变更日期  日期开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeBegin;

    @ApiModelProperty(value = "变更日期  日期结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeEnd;
}
