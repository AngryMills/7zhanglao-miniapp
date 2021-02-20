package com.mys.my.zhanglao.wx.miniapp.domain;

import java.util.Date;

public class GoldTimeFamily {
    private Integer id;

    private String familyId;

    private String familyName;

    private String familyImg;

    private Date createTime;

    private Byte isDelete;

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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getFamilyImg() {
        return familyImg;
    }

    public void setFamilyImg(String familyImg) {
        this.familyImg = familyImg == null ? null : familyImg.trim();
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

    @Override
    public String toString() {
        return "GoldTimeFamily{" +
            "id=" + id +
            ", familyId='" + familyId + '\'' +
            ", familyName='" + familyName + '\'' +
            ", familyImg='" + familyImg + '\'' +
            ", createTime=" + createTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
