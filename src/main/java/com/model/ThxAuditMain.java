package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class ThxAuditMain {
    private String auditId;

    private String inquiryCode;

    private String assessmentno;

    private Date dateFeedback;

    private String orgCode;

    private String vin;

    private String fbroleCode;

    private BigDecimal userId;

    private String taskTypeCode;

    private Date dateCreated;

    private Date dateUpdate;

    public ThxAuditMain(String auditId, String inquiryCode, String assessmentno, Date dateFeedback, String orgCode, String vin, String fbroleCode, BigDecimal userId, String taskTypeCode, Date dateCreated, Date dateUpdate) {
        this.auditId = auditId;
        this.inquiryCode = inquiryCode;
        this.assessmentno = assessmentno;
        this.dateFeedback = dateFeedback;
        this.orgCode = orgCode;
        this.vin = vin;
        this.fbroleCode = fbroleCode;
        this.userId = userId;
        this.taskTypeCode = taskTypeCode;
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

    public Date getDateFeedback() {
        return dateFeedback;
    }

    public void setDateFeedback(Date dateFeedback) {
        this.dateFeedback = dateFeedback;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getFbroleCode() {
        return fbroleCode;
    }

    public void setFbroleCode(String fbroleCode) {
        this.fbroleCode = fbroleCode == null ? null : fbroleCode.trim();
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