package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class ThxAuditMain {
    private String auditId;

    private String inquiryCode;

    private String assessmentno;

    private String orgCode;

    private String orgName;

    private String vin;

    private String carBrandName;

    private String auditRemark;

    private String userRoleName;

    private BigDecimal userId;

    private String taskTypeCode;

    private String taskTypeName;

    private Date dateCreated;

    private Date dateUpdate;

    public ThxAuditMain(String auditId, String inquiryCode, String assessmentno, String orgCode, String orgName, String vin, String carBrandName, String auditRemark, String userRoleName, BigDecimal userId, String taskTypeCode, String taskTypeName, Date dateCreated, Date dateUpdate) {
        this.auditId = auditId;
        this.inquiryCode = inquiryCode;
        this.assessmentno = assessmentno;
        this.orgCode = orgCode;
        this.orgName = orgName;
        this.vin = vin;
        this.carBrandName = carBrandName;
        this.auditRemark = auditRemark;
        this.userRoleName = userRoleName;
        this.userId = userId;
        this.taskTypeCode = taskTypeCode;
        this.taskTypeName = taskTypeName;
        this.dateCreated = dateCreated;
        this.dateUpdate = dateUpdate;
    }

    public ThxAuditMain() {
        super();
    }

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    public String getInquiryCode() {
        return inquiryCode;
    }

    public void setInquiryCode(String inquiryCode) {
        this.inquiryCode = inquiryCode == null ? null : inquiryCode.trim();
    }

    public String getAssessmentno() {
        return assessmentno;
    }

    public void setAssessmentno(String assessmentno) {
        this.assessmentno = assessmentno == null ? null : assessmentno.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName == null ? null : carBrandName.trim();
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName == null ? null : userRoleName.trim();
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getTaskTypeCode() {
        return taskTypeCode;
    }

    public void setTaskTypeCode(String taskTypeCode) {
        this.taskTypeCode = taskTypeCode == null ? null : taskTypeCode.trim();
    }

    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName == null ? null : taskTypeName.trim();
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