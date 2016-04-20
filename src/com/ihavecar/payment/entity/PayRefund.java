package com.ihavecar.payment.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PayRefund extends PayRefundKey {
    private Integer id;

    private BigDecimal refundAmount;

    private Integer status;

    private Integer refundBy;

    private String synReturnUrl;

    private String asynReturnUrl;

    private Integer refundType;

    private String refundTitle;

    private String refundDesc;

    private String refundIp;

    private Date addTime;

    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefundBy() {
        return refundBy;
    }

    public void setRefundBy(Integer refundBy) {
        this.refundBy = refundBy;
    }

    public String getSynReturnUrl() {
        return synReturnUrl;
    }

    public void setSynReturnUrl(String synReturnUrl) {
        this.synReturnUrl = synReturnUrl == null ? null : synReturnUrl.trim();
    }

    public String getAsynReturnUrl() {
        return asynReturnUrl;
    }

    public void setAsynReturnUrl(String asynReturnUrl) {
        this.asynReturnUrl = asynReturnUrl == null ? null : asynReturnUrl.trim();
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundTitle() {
        return refundTitle;
    }

    public void setRefundTitle(String refundTitle) {
        this.refundTitle = refundTitle == null ? null : refundTitle.trim();
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc == null ? null : refundDesc.trim();
    }

    public String getRefundIp() {
        return refundIp;
    }

    public void setRefundIp(String refundIp) {
        this.refundIp = refundIp == null ? null : refundIp.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}