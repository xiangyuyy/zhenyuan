package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra64 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "离退类别HD")
    private String a6405;

    @ApiModelProperty(value = "离退日期")
    private Date a6410;

    @ApiModelProperty(value = "办理时间")
    private Date a6416;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    @ApiModelProperty(value = "离退原因")
    private String a6411;

    private static final long serialVersionUID = 1L;

    public String getA0100() {
        return a0100;
    }

    public void setA0100(String a0100) {
        this.a0100 = a0100;
    }

    public String getA6405() {
        return a6405;
    }

    public void setA6405(String a6405) {
        this.a6405 = a6405;
    }

    public Date getA6410() {
        return a6410;
    }

    public void setA6410(Date a6410) {
        this.a6410 = a6410;
    }

    public Date getA6416() {
        return a6416;
    }

    public void setA6416(Date a6416) {
        this.a6416 = a6416;
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

    public String getA6411() {
        return a6411;
    }

    public void setA6411(String a6411) {
        this.a6411 = a6411;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a0100=").append(a0100);
        sb.append(", a6405=").append(a6405);
        sb.append(", a6410=").append(a6410);
        sb.append(", a6416=").append(a6416);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", a6411=").append(a6411);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}