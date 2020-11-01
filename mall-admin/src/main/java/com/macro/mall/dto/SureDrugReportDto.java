package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class SureDrugReportDto {
    @NotEmpty
    @ApiModelProperty(value = "reportTime", required = true)
    private Date reportTime;
    @NotEmpty
    @ApiModelProperty(value = "reportId", required = true)
    private String reportId;
}
