package com.ihavecar.payment.entity;

public class PayNotify {
    private Long id;

    private String outOrderNo;

    private String transactionId;

    private Integer type;

    private Integer status;

    private String notifyUrl;

    private Integer lastNotifyTime;

    private Integer currNotifyCount;

    private Integer addTime;

    private Integer updateTime;

    private String delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public Integer getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Integer lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
    }

    public Integer getCurrNotifyCount() {
        return currNotifyCount;
    }

    public void setCurrNotifyCount(Integer currNotifyCount) {
        this.currNotifyCount = currNotifyCount;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}