package com.model;

import java.util.Date;

public class ThxAuditInfos {
    private String auditInfoid;

    private String auditId;

    private String goodsName;

    private String localgoodsName;

    private String originalOem;

    private String localOem;

    private String accurateOem;

    private String supplierOem;

    private String receiveOem;

    private Integer qualityPrice;

    private String organizationCode;

    private String remark;

    private String state;

    private String choosenameType;

    private String chooseoemType;

    private Date dateCreated;

    private Date dateUpdate;

    public ThxAuditInfos(String auditInfoid, String auditId, String goodsName, String localgoodsName, String originalOem, String localOem, String accurateOem, String supplierOem, String receiveOem, Integer qualityPrice, String organizationCode, String remark, String state, String choosenameType, String chooseoemType, Date dateCreated, Date dateUpdate) {
        this.auditInfoid = auditInfoid;
        this.auditId = auditId;
        this.goodsName = goodsName;
        this.localgoodsName = localgoodsName;
        this.originalOem = originalOem;
        this.localOem = localOem;
        this.accurateOem = accurateOem;
        this.supplierOem = supplierOem;
        this.receiveOem = receiveOem;
        this.qualityPrice = qualityPrice;
        this.organizationCode = organizationCode;
        this.remark = remark;
        this.state = state;
        this.choosenameType = choosenameType;
        this.chooseoemType = chooseoemType;
        this.dateCreated = dateCreated;
        this.dateUpdate = dateUpdate;
    }

    public ThxAuditInfos() {
        super();
    }

    public String getAuditInfoid() {
        return auditInfoid;
    }

    public void setAuditInfoid(String auditInfoid) {
        this.auditInfoid = auditInfoid == null ? null : auditInfoid.trim();
    }

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getLocalgoodsName() {
        return localgoodsName;
    }

    public void setLocalgoodsName(String localgoodsName) {
        this.localgoodsName = localgoodsName == null ? null : localgoodsName.trim();
    }

    public String getOriginalOem() {
        return originalOem;
    }

    public void setOriginalOem(String originalOem) {
        this.originalOem = originalOem == null ? null : originalOem.trim();
    }

    public String getLocalOem() {
        return localOem;
    }

    public void setLocalOem(String localOem) {
        this.localOem = localOem == null ? null : localOem.trim();
    }

    public String getAccurateOem() {
        return accurateOem;
    }

    public void setAccurateOem(String accurateOem) {
        this.accurateOem = accurateOem == null ? null : accurateOem.trim();
    }

    public String getSupplierOem() {
        return supplierOem;
    }

    public void setSupplierOem(String supplierOem) {
        this.supplierOem = supplierOem == null ? null : supplierOem.trim();
    }

    public String getReceiveOem() {
        return receiveOem;
    }

    public void setReceiveOem(String receiveOem) {
        this.receiveOem = receiveOem == null ? null : receiveOem.trim();
    }

    public Integer getQualityPrice() {
        return qualityPrice;
    }

    public void setQualityPrice(Integer qualityPrice) {
        this.qualityPrice = qualityPrice;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getChoosenameType() {
        return choosenameType;
    }

    public void setChoosenameType(String choosenameType) {
        this.choosenameType = choosenameType == null ? null : choosenameType.trim();
    }

    public String getChooseoemType() {
        return chooseoemType;
    }

    public void setChooseoemType(String chooseoemType) {
        this.chooseoemType = chooseoemType == null ? null : chooseoemType.trim();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}