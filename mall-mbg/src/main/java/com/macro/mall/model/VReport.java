package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class VReport implements Serializable {
    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "门店")
    private String shopname;

    @ApiModelProperty(value = "编制要求职称对应人数")
    private Integer num;

    @ApiModelProperty(value = "编制要求职称")
    private String type;

    @ApiModelProperty(value = "实际配置人数")
    private Long nownum;

    @ApiModelProperty(value = "差异")
    private Long diff;

    private static final long serialVersionUID = 1L;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getNownum() {
        return nownum;
    }

    public void setNownum(Long nownum) {
        this.nownum = nownum;
    }

    public Long getDiff() {
        return diff;
    }

    public void setDiff(Long diff) {
        this.diff = diff;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", shopname=").append(shopname);
        sb.append(", num=").append(num);
        sb.append(", type=").append(type);
        sb.append(", nownum=").append(nownum);
        sb.append(", diff=").append(diff);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}