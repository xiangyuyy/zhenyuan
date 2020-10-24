package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable {
    @ApiModelProperty(value = "组织机构id")
    private String codeitemid;

    @ApiModelProperty(value = "类型")
    private String codesetid;

    @ApiModelProperty(value = "组织名称")
    private String codeitemdesc;

    @ApiModelProperty(value = "上级编码")
    private String parentid;

    @ApiModelProperty(value = "下级编码")
    private String childid;

    @ApiModelProperty(value = "组织层级")
    private Integer grade;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "有效时间始")
    private Date startDate;

    @ApiModelProperty(value = "有效时间止")
    private Date endDate;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getCodeitemid() {
        return codeitemid;
    }

    public void setCodeitemid(String codeitemid) {
        this.codeitemid = codeitemid;
    }

    public String getCodesetid() {
        return codesetid;
    }

    public void setCodesetid(String codesetid) {
        this.codesetid = codesetid;
    }

    public String getCodeitemdesc() {
        return codeitemdesc;
    }

    public void setCodeitemdesc(String codeitemdesc) {
        this.codeitemdesc = codeitemdesc;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getChildid() {
        return childid;
    }

    public void setChildid(String childid) {
        this.childid = childid;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeitemid=").append(codeitemid);
        sb.append(", codesetid=").append(codesetid);
        sb.append(", codeitemdesc=").append(codeitemdesc);
        sb.append(", parentid=").append(parentid);
        sb.append(", childid=").append(childid);
        sb.append(", grade=").append(grade);
        sb.append(", state=").append(state);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}