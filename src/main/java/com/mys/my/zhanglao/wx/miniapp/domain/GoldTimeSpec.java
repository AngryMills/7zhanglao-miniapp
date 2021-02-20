package com.mys.my.zhanglao.wx.miniapp.domain;

import java.util.Date;

public class GoldTimeSpec {
    private Integer id;

    private String familyId;

    private String genId;

    private String speId;

    private String familyName;

    private String genName;

    private String speName;

    private String speImg;

    private String speCon;

    private String tim;

    private Date createTime;

    private Byte isDelete;

    private Integer water;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId == null ? null : familyId.trim();
    }

    public String getGenId() {
        return genId;
    }

    public void setGenId(String genId) {
        this.genId = genId == null ? null : genId.trim();
    }

    public String getSpeId() {
        return speId;
    }

    public void setSpeId(String speId) {
        this.speId = speId == null ? null : speId.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getGenName() {
        return genName;
    }

    public void setGenName(String genName) {
        this.genName = genName == null ? null : genName.trim();
    }

    public String getSpeName() {
        return speName;
    }

    public void setSpeName(String speName) {
        this.speName = speName == null ? null : speName.trim();
    }

    public String getSpeImg() {
        return speImg;
    }

    public void setSpeImg(String speImg) {
        this.speImg = speImg == null ? null : speImg.trim();
    }

    public String getSpeCon() {
        return speCon;
    }

    public void setSpeCon(String speCon) {
        this.speCon = speCon == null ? null : speCon.trim();
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim == null ? null : tim.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "GoldTimeSpec{" +
            "id=" + id +
            ", familyId='" + familyId + '\'' +
            ", genId='" + genId + '\'' +
            ", speId='" + speId + '\'' +
            ", familyName='" + familyName + '\'' +
            ", genName='" + genName + '\'' +
            ", speName='" + speName + '\'' +
            ", speImg='" + speImg + '\'' +
            ", speCon='" + speCon + '\'' +
            ", tim='" + tim + '\'' +
            ", createTime=" + createTime +
            ", isDelete=" + isDelete +
            ", water=" + water +
            '}';
    }
}
