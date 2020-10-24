package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Usra01 implements Serializable {
    @ApiModelProperty(value = "人员id")
    private String a0100;

    @ApiModelProperty(value = "组织机构id")
    private String b0110;

    @ApiModelProperty(value = "出生日期")
    private Date a0111;

    @ApiModelProperty(value = "参加工作时间")
    private Date a0141;

    @ApiModelProperty(value = "性别AX")
    private String a0107;

    @ApiModelProperty(value = "身份证号")
    private String a0177;

    @ApiModelProperty(value = "民族AE")
    private String a0121;

    @ApiModelProperty(value = "籍贯AB")
    private String a0114;

    @ApiModelProperty(value = "户口所在地")
    private String a0171;

    @ApiModelProperty(value = "姓名")
    private String a0101;

    @ApiModelProperty(value = "户口性质HP")
    private String a0174;

    @ApiModelProperty(value = "年龄")
    private Integer a0112;

    @ApiModelProperty(value = "拼音简码")
    private String a0103;

    @ApiModelProperty(value = "手机号码")
    private String a0148;

    @ApiModelProperty(value = "人员类别XL")
    private String a0183;

    @ApiModelProperty(value = "到本单位时间")
    private Date a0142;

    @ApiModelProperty(value = "电子邮箱")
    private String a0146;

    @ApiModelProperty(value = "现住址")
    private String a0119;

    @ApiModelProperty(value = "专业")
    private String a0130;

    @ApiModelProperty(value = "最高学历AM")
    private String a0134;

    @ApiModelProperty(value = "人员编码")
    private String a0144;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date modtime;

    @ApiModelProperty(value = "信息备注")
    private String a01ad;

    private static final long serialVersionUID = 1L;

    public String getA0100() {
        return a0100;
    }

    public void setA0100(String a0100) {
        this.a0100 = a0100;
    }

    public String getB0110() {
        return b0110;
    }

    public void setB0110(String b0110) {
        this.b0110 = b0110;
    }

    public Date getA0111() {
        return a0111;
    }

    public void setA0111(Date a0111) {
        this.a0111 = a0111;
    }

    public Date getA0141() {
        return a0141;
    }

    public void setA0141(Date a0141) {
        this.a0141 = a0141;
    }

    public String getA0107() {
        return a0107;
    }

    public void setA0107(String a0107) {
        this.a0107 = a0107;
    }

    public String getA0177() {
        return a0177;
    }

    public void setA0177(String a0177) {
        this.a0177 = a0177;
    }

    public String getA0121() {
        return a0121;
    }

    public void setA0121(String a0121) {
        this.a0121 = a0121;
    }

    public String getA0114() {
        return a0114;
    }

    public void setA0114(String a0114) {
        this.a0114 = a0114;
    }

    public String getA0171() {
        return a0171;
    }

    public void setA0171(String a0171) {
        this.a0171 = a0171;
    }

    public String getA0101() {
        return a0101;
    }

    public void setA0101(String a0101) {
        this.a0101 = a0101;
    }

    public String getA0174() {
        return a0174;
    }

    public void setA0174(String a0174) {
        this.a0174 = a0174;
    }

    public Integer getA0112() {
        return a0112;
    }

    public void setA0112(Integer a0112) {
        this.a0112 = a0112;
    }

    public String getA0103() {
        return a0103;
    }

    public void setA0103(String a0103) {
        this.a0103 = a0103;
    }

    public String getA0148() {
        return a0148;
    }

    public void setA0148(String a0148) {
        this.a0148 = a0148;
    }

    public String getA0183() {
        return a0183;
    }

    public void setA0183(String a0183) {
        this.a0183 = a0183;
    }

    public Date getA0142() {
        return a0142;
    }

    public void setA0142(Date a0142) {
        this.a0142 = a0142;
    }

    public String getA0146() {
        return a0146;
    }

    public void setA0146(String a0146) {
        this.a0146 = a0146;
    }

    public String getA0119() {
        return a0119;
    }

    public void setA0119(String a0119) {
        this.a0119 = a0119;
    }

    public String getA0130() {
        return a0130;
    }

    public void setA0130(String a0130) {
        this.a0130 = a0130;
    }

    public String getA0134() {
        return a0134;
    }

    public void setA0134(String a0134) {
        this.a0134 = a0134;
    }

    public String getA0144() {
        return a0144;
    }

    public void setA0144(String a0144) {
        this.a0144 = a0144;
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

    public String getA01ad() {
        return a01ad;
    }

    public void setA01ad(String a01ad) {
        this.a01ad = a01ad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a0100=").append(a0100);
        sb.append(", b0110=").append(b0110);
        sb.append(", a0111=").append(a0111);
        sb.append(", a0141=").append(a0141);
        sb.append(", a0107=").append(a0107);
        sb.append(", a0177=").append(a0177);
        sb.append(", a0121=").append(a0121);
        sb.append(", a0114=").append(a0114);
        sb.append(", a0171=").append(a0171);
        sb.append(", a0101=").append(a0101);
        sb.append(", a0174=").append(a0174);
        sb.append(", a0112=").append(a0112);
        sb.append(", a0103=").append(a0103);
        sb.append(", a0148=").append(a0148);
        sb.append(", a0183=").append(a0183);
        sb.append(", a0142=").append(a0142);
        sb.append(", a0146=").append(a0146);
        sb.append(", a0119=").append(a0119);
        sb.append(", a0130=").append(a0130);
        sb.append(", a0134=").append(a0134);
        sb.append(", a0144=").append(a0144);
        sb.append(", createtime=").append(createtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", a01ad=").append(a01ad);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}