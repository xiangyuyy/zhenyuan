package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra71 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "合同类型BT")
    private String a7104;

    @ApiModelProperty(value = "合同终止时间")
    private Date a7110;

    @ApiModelProperty(value = "合同起始时间")
    private Date a7105;

    @ApiModelProperty(value = "实际终止时间")
    private Date a7125;

    @ApiModelProperty(value = "合同备注")
    private String a7130;

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

    public String getA7104() {
        return a7104;
    }

    public void setA7104(String a7104) {
        this.a7104 = a7104;
    }

    public Date getA7110() {
        return a7110;
    }

    public void setA7110(Date a7110) {
        this.a7110 = a7110;
    }

    public Date getA7105() {
        return a7105;
    }

    public void setA7105(Date a7105) {
        this.a7105 = a7105;
    }

    public Date getA7125() {
        return a7125;
    }

    public void setA7125(Date a7125) {
        this.a7125 = a7125;
    }

    public String getA7130() {
        return a7130;
    }

    public void setA7130(String a7130) {
        this.a7130 = a7130;
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
        sb.append(", a7104=").append(a7104);
        sb.append(", a7110=").append(a7110);
        sb.append(", a7105=").append(a7105);
        sb.append(", a7125=").append(a7125);
        sb.append(", a7130=").append(a7130);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}