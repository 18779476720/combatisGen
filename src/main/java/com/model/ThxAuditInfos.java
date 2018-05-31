package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class ThxAuditInfos {
    private String auditInfoid;

    private String auditId;

    private String goodsId;

    private String jyId;

    private String assessmentno;

    private String goodsName;

    private String localgoodsName;

    private String originalOem;

    private String localOem;

    private String accurateOem;

    private String supplierOem;

    private String receiveOem;

    private BigDecimal qualityPrice;

    private String organizationCode;

    private String pictureId;

    private String remark;

    private String state;

    private String choosenameType;

    private String chooseoemType;

    private String auditNameType;

    private String auditOemType;

    private Date dateCreated;

    private Date dateUpdate;

    public ThxAuditInfos(String auditInfoid, String auditId, String goodsId, String jyId, String assessmentno, String goodsName, String localgoodsName, String originalOem, String localOem, String accurateOem, String supplierOem, String receiveOem, BigDecimal qualityPrice, String organizationCode, String pictureId, String remark, String state, String choosenameType, String chooseoemType, String auditNameType, String auditOemType, Date dateCreated, Date dateUpdate) {
        this.auditInfoid = auditInfoid;
        this.auditId = auditId;
        this.goodsId = goodsId;
        this.jyId = jyId;
        this.assessmentno = assessmentno;
        this.goodsName = goodsName;
        this.localgoodsName = localgoodsName;
        this.originalOem = originalOem;
        this.localOem = localOem;
        this.accurateOem = accurateOem;
        this.supplierOem = supplierOem;
        this.receiveOem = receiveOem;
        this.qualityPrice = qualityPrice;
        this.organizationCode = organizationCode;
        this.pictureId = pictureId;
        this.remark = remark;
        this.state = state;
        this.choosenameType = choosenameType;
        this.chooseoemType = chooseoemType;
        this.auditNameType = auditNameType;
        this.auditOemType = auditOemType;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getJyId() {
        return jyId;
    }

    public void setJyId(String jyId) {
        this.jyId = jyId == null ? null : jyId.trim();
    }

    public String getAssessmentno() {
        return assessmentno;
    }

    public void setAssessmentno(String assessmentno) {
        this.assessmentno = assessmentno == null ? null : assessmentno.trim();
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

    public BigDecimal getQualityPrice() {
        return qualityPrice;
    }

    public void setQualityPrice(BigDecimal qualityPrice) {
        this.qualityPrice = qualityPrice;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
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

    public String getAuditNameType() {
        return auditNameType;
    }

    public void setAuditNameType(String auditNameType) {
        this.auditNameType = auditNameType == null ? null : auditNameType.trim();
    }

    public String getAuditOemType() {
        return auditOemType;
    }

    public void setAuditOemType(String auditOemType) {
        this.auditOemType = auditOemType == null ? null : auditOemType.trim();
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