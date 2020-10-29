package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class VZhicheng implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String gh;

    @ApiModelProperty(value = "职称")
    private String zcjb;

    @ApiModelProperty(value = "职称时间")
    private Date zcsj;

    @ApiModelProperty(value = "证书编号")
    private String zcbh;

    @ApiModelProperty(value = "可聘日期")
    private Date kprq;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    private static final long serialVersionUID = 1L;

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    public String getZcjb() {
        return zcjb;
    }

    public void setZcjb(String zcjb) {
        this.zcjb = zcjb;
    }

    public Date getZcsj() {
        return zcsj;
    }

    public void setZcsj(Date zcsj) {
        this.zcsj = zcsj;
    }

    public String getZcbh() {
        return zcbh;
    }

    public void setZcbh(String zcbh) {
        this.zcbh = zcbh;
    }

    public Date getKprq() {
        return kprq;
    }

    public void setKprq(Date kprq) {
        this.kprq = kprq;
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
        sb.append(", gh=").append(gh);
        sb.append(", zcjb=").append(zcjb);
        sb.append(", zcsj=").append(zcsj);
        sb.append(", zcbh=").append(zcbh);
        sb.append(", kprq=").append(kprq);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}