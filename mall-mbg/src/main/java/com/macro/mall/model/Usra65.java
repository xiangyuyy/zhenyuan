package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra65 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "返聘单位")
    private String a6501;

    @ApiModelProperty(value = "返聘类别")
    private String a6502;

    @ApiModelProperty(value = "返聘起始时间")
    private Date a6503;

    @ApiModelProperty(value = "返聘终止时间")
    private Date a6504;

    @ApiModelProperty(value = "返聘岗位")
    private String a6507;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    @ApiModelProperty(value = "返聘原因")
    private String a6506;

    private static final long serialVersionUID = 1L;

    public String getA0100() {
        return a0100;
    }

    public void setA0100(String a0100) {
        this.a0100 = a0100;
    }

    public String getA6501() {
        return a6501;
    }

    public void setA6501(String a6501) {
        this.a6501 = a6501;
    }

    public String getA6502() {
        return a6502;
    }

    public void setA6502(String a6502) {
        this.a6502 = a6502;
    }

    public Date getA6503() {
        return a6503;
    }

    public void setA6503(Date a6503) {
        this.a6503 = a6503;
    }

    public Date getA6504() {
        return a6504;
    }

    public void setA6504(Date a6504) {
        this.a6504 = a6504;
    }

    public String getA6507() {
        return a6507;
    }

    public void setA6507(String a6507) {
        this.a6507 = a6507;
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

    public String getA6506() {
        return a6506;
    }

    public void setA6506(String a6506) {
        this.a6506 = a6506;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a0100=").append(a0100);
        sb.append(", a6501=").append(a6501);
        sb.append(", a6502=").append(a6502);
        sb.append(", a6503=").append(a6503);
        sb.append(", a6504=").append(a6504);
        sb.append(", a6507=").append(a6507);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", a6506=").append(a6506);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}