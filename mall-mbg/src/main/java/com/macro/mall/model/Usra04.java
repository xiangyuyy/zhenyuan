package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra04 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "学历性质DC")
    private String a0449;

    @ApiModelProperty(value = "学历AM")
    private String a0405;

    @ApiModelProperty(value = "所学专业（描述）")
    private String a0444;

    @ApiModelProperty(value = "毕业学校")
    private String a0435;

    @ApiModelProperty(value = "是否管理")
    private String a04ac;

    @ApiModelProperty(value = "所学专业AI")
    private String a0410;

    @ApiModelProperty(value = "是否最高学历")
    private String a04ad;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    private static final long serialVersionUID = 1L;

    public String getA0100() {
        return a0100;
    }

    public void setA0100(String a0100) {
        this.a0100 = a0100;
    }

    public String getA0449() {
        return a0449;
    }

    public void setA0449(String a0449) {
        this.a0449 = a0449;
    }

    public String getA0405() {
        return a0405;
    }

    public void setA0405(String a0405) {
        this.a0405 = a0405;
    }

    public String getA0444() {
        return a0444;
    }

    public void setA0444(String a0444) {
        this.a0444 = a0444;
    }

    public String getA0435() {
        return a0435;
    }

    public void setA0435(String a0435) {
        this.a0435 = a0435;
    }

    public String getA04ac() {
        return a04ac;
    }

    public void setA04ac(String a04ac) {
        this.a04ac = a04ac;
    }

    public String getA0410() {
        return a0410;
    }

    public void setA0410(String a0410) {
        this.a0410 = a0410;
    }

    public String getA04ad() {
        return a04ad;
    }

    public void setA04ad(String a04ad) {
        this.a04ad = a04ad;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a0100=").append(a0100);
        sb.append(", a0449=").append(a0449);
        sb.append(", a0405=").append(a0405);
        sb.append(", a0444=").append(a0444);
        sb.append(", a0435=").append(a0435);
        sb.append(", a04ac=").append(a04ac);
        sb.append(", a0410=").append(a0410);
        sb.append(", a04ad=").append(a04ad);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}