package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra66 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "离职日期")
    private Date a6605;

    @ApiModelProperty(value = "离职原因DK")
    private String a6607;

    @ApiModelProperty(value = "离职前类别XL")
    private String a66aa;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    @ApiModelProperty(value = "离职说明")
    private String a6609;

    private static final long serialVersionUID = 1L;

    public String getA0100() {
        return a0100;
    }

    public void setA0100(String a0100) {
        this.a0100 = a0100;
    }

    public Date getA6605() {
        return a6605;
    }

    public void setA6605(Date a6605) {
        this.a6605 = a6605;
    }

    public String getA6607() {
        return a6607;
    }

    public void setA6607(String a6607) {
        this.a6607 = a6607;
    }

    public String getA66aa() {
        return a66aa;
    }

    public void setA66aa(String a66aa) {
        this.a66aa = a66aa;
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

    public String getA6609() {
        return a6609;
    }

    public void setA6609(String a6609) {
        this.a6609 = a6609;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a0100=").append(a0100);
        sb.append(", a6605=").append(a6605);
        sb.append(", a6607=").append(a6607);
        sb.append(", a66aa=").append(a66aa);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", a6609=").append(a6609);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}