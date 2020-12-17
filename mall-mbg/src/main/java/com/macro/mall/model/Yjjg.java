package com.macro.mall.model;

import java.io.Serializable;

public class Yjjg implements Serializable {
    private String jgbm;

    private Integer yjhds;

    private Integer zyzys;

    private Integer zyys;

    private Integer zys;

    private Integer ys;

    private Integer jg;

    private static final long serialVersionUID = 1L;

    public String getJgbm() {
        return jgbm;
    }

    public void setJgbm(String jgbm) {
        this.jgbm = jgbm;
    }

    public Integer getYjhds() {
        return yjhds;
    }

    public void setYjhds(Integer yjhds) {
        this.yjhds = yjhds;
    }

    public Integer getZyzys() {
        return zyzys;
    }

    public void setZyzys(Integer zyzys) {
        this.zyzys = zyzys;
    }

    public Integer getZyys() {
        return zyys;
    }

    public void setZyys(Integer zyys) {
        this.zyys = zyys;
    }

    public Integer getZys() {
        return zys;
    }

    public void setZys(Integer zys) {
        this.zys = zys;
    }

    public Integer getYs() {
        return ys;
    }

    public void setYs(Integer ys) {
        this.ys = ys;
    }

    public Integer getJg() {
        return jg;
    }

    public void setJg(Integer jg) {
        this.jg = jg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jgbm=").append(jgbm);
        sb.append(", yjhds=").append(yjhds);
        sb.append(", zyzys=").append(zyzys);
        sb.append(", zyys=").append(zyys);
        sb.append(", zys=").append(zys);
        sb.append(", ys=").append(ys);
        sb.append(", jg=").append(jg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}