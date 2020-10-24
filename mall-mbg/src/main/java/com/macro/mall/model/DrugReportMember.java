package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DrugReportMember implements Serializable {
    private Long id;

    @ApiModelProperty(value = "单号")
    private String reportId;

    @ApiModelProperty(value = "2.0人员id")
    private String memberId;

    @ApiModelProperty(value = "药监门店id")
    private String drugShopId;

    @ApiModelProperty(value = "药监上报职称")
    private String drugTitleId;

    @ApiModelProperty(value = "药监编制职称")
    private String drugOrgId;

    @ApiModelProperty(value = "药监学历")
    private String drugEducationId;

    @ApiModelProperty(value = "药监专业")
    private String drugMajorId;

    @ApiModelProperty(value = "职务或岗位1")
    private String drugPositionOneId;

    @ApiModelProperty(value = "职务或岗位2")
    private String drugPositionTwoId;

    @ApiModelProperty(value = "职务或岗位3")
    private String drugPositionThreeId;

    @ApiModelProperty(value = "参加专业工作时间")
    private Date workTime;

    @ApiModelProperty(value = "健康状况：0->不健康；1->健康")
    private Integer healthStatus;

    @ApiModelProperty(value = "是否继续教育：0->否；1->是")
    private Integer educationStatus;

    @ApiModelProperty(value = "是否参加培训：0->否；1->是")
    private Integer trainStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getDrugShopId() {
        return drugShopId;
    }

    public void setDrugShopId(String drugShopId) {
        this.drugShopId = drugShopId;
    }

    public String getDrugTitleId() {
        return drugTitleId;
    }

    public void setDrugTitleId(String drugTitleId) {
        this.drugTitleId = drugTitleId;
    }

    public String getDrugOrgId() {
        return drugOrgId;
    }

    public void setDrugOrgId(String drugOrgId) {
        this.drugOrgId = drugOrgId;
    }

    public String getDrugEducationId() {
        return drugEducationId;
    }

    public void setDrugEducationId(String drugEducationId) {
        this.drugEducationId = drugEducationId;
    }

    public String getDrugMajorId() {
        return drugMajorId;
    }

    public void setDrugMajorId(String drugMajorId) {
        this.drugMajorId = drugMajorId;
    }

    public String getDrugPositionOneId() {
        return drugPositionOneId;
    }

    public void setDrugPositionOneId(String drugPositionOneId) {
        this.drugPositionOneId = drugPositionOneId;
    }

    public String getDrugPositionTwoId() {
        return drugPositionTwoId;
    }

    public void setDrugPositionTwoId(String drugPositionTwoId) {
        this.drugPositionTwoId = drugPositionTwoId;
    }

    public String getDrugPositionThreeId() {
        return drugPositionThreeId;
    }

    public void setDrugPositionThreeId(String drugPositionThreeId) {
        this.drugPositionThreeId = drugPositionThreeId;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Integer getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(Integer healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Integer getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(Integer educationStatus) {
        this.educationStatus = educationStatus;
    }

    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportId=").append(reportId);
        sb.append(", memberId=").append(memberId);
        sb.append(", drugShopId=").append(drugShopId);
        sb.append(", drugTitleId=").append(drugTitleId);
        sb.append(", drugOrgId=").append(drugOrgId);
        sb.append(", drugEducationId=").append(drugEducationId);
        sb.append(", drugMajorId=").append(drugMajorId);
        sb.append(", drugPositionOneId=").append(drugPositionOneId);
        sb.append(", drugPositionTwoId=").append(drugPositionTwoId);
        sb.append(", drugPositionThreeId=").append(drugPositionThreeId);
        sb.append(", workTime=").append(workTime);
        sb.append(", healthStatus=").append(healthStatus);
        sb.append(", educationStatus=").append(educationStatus);
        sb.append(", trainStatus=").append(trainStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}