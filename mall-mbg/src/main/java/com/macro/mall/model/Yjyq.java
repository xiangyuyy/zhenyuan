package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Yjyq implements Serializable {
    private String jgbm;

    private String sfybmd;

    private String ycsf;

    private String ywzy;

    private BigDecimal mdmj;

    private String lsgx;

    private static final long serialVersionUID = 1L;

    public String getJgbm() {
        return jgbm;
    }

    public void setJgbm(String jgbm) {
        this.jgbm = jgbm;
    }

    public String getSfybmd() {
        return sfybmd;
    }

    public void setSfybmd(String sfybmd) {
        this.sfybmd = sfybmd;
    }

    public String getYcsf() {
        return ycsf;
    }

    public void setYcsf(String ycsf) {
        this.ycsf = ycsf;
    }

    public String getYwzy() {
        return ywzy;
    }

    public void setYwzy(String ywzy) {
        this.ywzy = ywzy;
    }

    public BigDecimal getMdmj() {
        return mdmj;
    }

    public void setMdmj(BigDecimal mdmj) {
        this.mdmj = mdmj;
    }

    public String getLsgx() {
        return lsgx;
    }

    public void setLsgx(String lsgx) {
        this.lsgx = lsgx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jgbm=").append(jgbm);
        sb.append(", sfybmd=").append(sfybmd);
        sb.append(", ycsf=").append(ycsf);
        sb.append(", ywzy=").append(ywzy);
        sb.append(", mdmj=").append(mdmj);
        sb.append(", lsgx=").append(lsgx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}