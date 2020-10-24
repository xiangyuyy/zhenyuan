package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Codeitem implements Serializable {
    @ApiModelProperty(value = "codesetid-AM")
    private String codesetid;

    @ApiModelProperty(value = "id")
    private String codeitemid;

    @ApiModelProperty(value = "描述")
    private String codeitemdesc;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    private static final long serialVersionUID = 1L;

    public String getCodesetid() {
        return codesetid;
    }

    public void setCodesetid(String codesetid) {
        this.codesetid = codesetid;
    }

    public String getCodeitemid() {
        return codeitemid;
    }

    public void setCodeitemid(String codeitemid) {
        this.codeitemid = codeitemid;
    }

    public String getCodeitemdesc() {
        return codeitemdesc;
    }

    public void setCodeitemdesc(String codeitemdesc) {
        this.codeitemdesc = codeitemdesc;
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
        sb.append(", codesetid=").append(codesetid);
        sb.append(", codeitemid=").append(codeitemid);
        sb.append(", codeitemdesc=").append(codeitemdesc);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}