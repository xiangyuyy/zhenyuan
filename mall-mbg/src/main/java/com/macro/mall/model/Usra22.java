package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra22 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "参加党派时间")
    private Date a2210;

    @ApiModelProperty(value = "政治面貌AT")
    private String a2205;

    @ApiModelProperty(value = "异常类别CA")
    private String a2230;

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

    public Date getA2210() {
        return a2210;
    }

    public void setA2210(Date a2210) {
        this.a2210 = a2210;
    }

    public String getA2205() {
        return a2205;
    }

    public void setA2205(String a2205) {
        this.a2205 = a2205;
    }

    public String getA2230() {
        return a2230;
    }

    public void setA2230(String a2230) {
        this.a2230 = a2230;
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
        sb.append(", a2210=").append(a2210);
        sb.append(", a2205=").append(a2205);
        sb.append(", a2230=").append(a2230);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}