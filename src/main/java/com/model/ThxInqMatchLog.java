package com.model;

import java.math.BigDecimal;

public class ThxInqMatchLog {
    private String matchId;

    private String inquiryCode;

    private String goodsName;

    private String mGoodsName;

    private String originalOem;

    private String vinCode;

    private String mCarName;

    private String localCarName;

    private String remark;

    private Short isVinMatch;

    private Short isOemMatch;

    private BigDecimal mLossRp;

    private BigDecimal mMarketRp;

    private BigDecimal localSysRp;

    private BigDecimal localMarketRp;

    private Short executeWay;

    private String localOem;

    private String goodsId;

    public ThxInqMatchLog(String matchId, String inquiryCode, String goodsName, String mGoodsName, String originalOem, String vinCode, String mCarName, String localCarName, String remark, Short isVinMatch, Short isOemMatch, BigDecimal mLossRp, BigDecimal mMarketRp, BigDecimal localSysRp, BigDecimal localMarketRp, Short executeWay, String localOem, String goodsId) {
        this.matchId = matchId;
        this.inquiryCode = inquiryCode;
        this.goodsName = goodsName;
        this.mGoodsName = mGoodsName;
        this.originalOem = originalOem;
        this.vinCode = vinCode;
        this.mCarName = mCarName;
        this.localCarName = localCarName;
        this.remark = remark;
        this.isVinMatch = isVinMatch;
        this.isOemMatch = isOemMatch;
        this.mLossRp = mLossRp;
        this.mMarketRp = mMarketRp;
        this.localSysRp = localSysRp;
        this.localMarketRp = localMarketRp;
        this.executeWay = executeWay;
        this.localOem = localOem;
        this.goodsId = goodsId;
    }

    public ThxInqMatchLog() {
        super();
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId == null ? null : matchId.trim();
    }

    public String getInquiryCode() {
        return inquiryCode;
    }

    public void setInquiryCode(String inquiryCode) {
        this.inquiryCode = inquiryCode == null ? null : inquiryCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getmGoodsName() {
        return mGoodsName;
    }

    public void setmGoodsName(String mGoodsName) {
        this.mGoodsName = mGoodsName == null ? null : mGoodsName.trim();
    }

    public String getOriginalOem() {
        return originalOem;
    }

    public void setOriginalOem(String originalOem) {
        this.originalOem = originalOem == null ? null : originalOem.trim();
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode == null ? null : vinCode.trim();
    }

    public String getmCarName() {
        return mCarName;
    }

    public void setmCarName(String mCarName) {
        this.mCarName = mCarName == null ? null : mCarName.trim();
    }

    public String getLocalCarName() {
        return localCarName;
    }

    public void setLocalCarName(String localCarName) {
        this.localCarName = localCarName == null ? null : localCarName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsVinMatch() {
        return isVinMatch;
    }

    public void setIsVinMatch(Short isVinMatch) {
        this.isVinMatch = isVinMatch;
    }

    public Short getIsOemMatch() {
        return isOemMatch;
    }

    public void setIsOemMatch(Short isOemMatch) {
        this.isOemMatch = isOemMatch;
    }

    public BigDecimal getmLossRp() {
        return mLossRp;
    }

    public void setmLossRp(BigDecimal mLossRp) {
        this.mLossRp = mLossRp;
    }

    public BigDecimal getmMarketRp() {
        return mMarketRp;
    }

    public void setmMarketRp(BigDecimal mMarketRp) {
        this.mMarketRp = mMarketRp;
    }

    public BigDecimal getLocalSysRp() {
        return localSysRp;
    }

    public void setLocalSysRp(BigDecimal localSysRp) {
        this.localSysRp = localSysRp;
    }

    public BigDecimal getLocalMarketRp() {
        return localMarketRp;
    }

    public void setLocalMarketRp(BigDecimal localMarketRp) {
        this.localMarketRp = localMarketRp;
    }

    public Short getExecuteWay() {
        return executeWay;
    }

    public void setExecuteWay(Short executeWay) {
        this.executeWay = executeWay;
    }

    public String getLocalOem() {
        return localOem;
    }

    public void setLocalOem(String localOem) {
        this.localOem = localOem == null ? null : localOem.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }
}