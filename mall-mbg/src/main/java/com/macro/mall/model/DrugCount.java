package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class DrugCount implements Serializable {
    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "行政隶属：1->市区；2->乡镇；3->村")
    private Integer subjection;

    @ApiModelProperty(value = "有无中药：0->无；1->有")
    private Integer chineseMedicine;

    @ApiModelProperty(value = "是否远程：0->无；1->有")
    private Integer longRange;

    @ApiModelProperty(value = "经营面积")
    private BigDecimal area;

    @ApiModelProperty(value = "执业药师")
    private Integer praPharmacist;

    @ApiModelProperty(value = "执业中药师")
    private Integer praChinesePharmacist;

    @ApiModelProperty(value = "药师")
    private Integer pharmacist;

    @ApiModelProperty(value = "技工")
    private Integer mechanic;

    private static final long serialVersionUID = 1L;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getSubjection() {
        return subjection;
    }

    public void setSubjection(Integer subjection) {
        this.subjection = subjection;
    }

    public Integer getChineseMedicine() {
        return chineseMedicine;
    }

    public void setChineseMedicine(Integer chineseMedicine) {
        this.chineseMedicine = chineseMedicine;
    }

    public Integer getLongRange() {
        return longRange;
    }

    public void setLongRange(Integer longRange) {
        this.longRange = longRange;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Integer getPraPharmacist() {
        return praPharmacist;
    }

    public void setPraPharmacist(Integer praPharmacist) {
        this.praPharmacist = praPharmacist;
    }

    public Integer getPraChinesePharmacist() {
        return praChinesePharmacist;
    }

    public void setPraChinesePharmacist(Integer praChinesePharmacist) {
        this.praChinesePharmacist = praChinesePharmacist;
    }

    public Integer getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Integer pharmacist) {
        this.pharmacist = pharmacist;
    }

    public Integer getMechanic() {
        return mechanic;
    }

    public void setMechanic(Integer mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", subjection=").append(subjection);
        sb.append(", chineseMedicine=").append(chineseMedicine);
        sb.append(", longRange=").append(longRange);
        sb.append(", area=").append(area);
        sb.append(", praPharmacist=").append(praPharmacist);
        sb.append(", praChinesePharmacist=").append(praChinesePharmacist);
        sb.append(", pharmacist=").append(pharmacist);
        sb.append(", mechanic=").append(mechanic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}