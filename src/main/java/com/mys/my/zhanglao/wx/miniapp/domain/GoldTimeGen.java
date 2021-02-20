package com.mys.my.zhanglao.wx.miniapp.domain;

import java.util.Date;

public class GoldTimeGen {
    private Integer id;

    private String familyId;

    private String genId;

    private String genName;

    private String genImg;

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

    public String getGenId() {
        return genId;
    }

    public void setGenId(String genId) {
        this.genId = genId == null ? null : genId.trim();
    }

    public String getGenName() {
        return genName;
    }

    public void setGenName(String genName) {
        this.genName = genName == null ? null : genName.trim();
    }

    public String getGenImg() {
        return genImg;
    }

    public void setGenImg(String genImg) {
        this.genImg = genImg == null ? null : genImg.trim();
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
}