package com.ihavecar.payment.entity;

import java.math.BigDecimal;

public class PayOrder extends PayOrderKey {
    private Long id;

    private Integer orderCreateBy;

    private BigDecimal orderTotalAmount;

    private BigDecimal orderActualAmount;

    private Integer orderStatus;

    private BigDecimal preferenceAmount;

    private String asynReturnUrl;

    private String synReturnUrl;

    private Integer addTime;

    private Integer orderType;

    private Integer payType;

    private String orderTitle;

    private String orderDesc;

    private Integer updateTime;

    private String orderIp;

    private Integer orderBy;

    private String payAccount;

    private String mergeOrderNo;

    private String delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderCreateBy() {
        return orderCreateBy;
    }

    public void setOrderCreateBy(Integer orderCreateBy) {
        this.orderCreateBy = orderCreateBy;
    }

    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public BigDecimal getOrderActualAmount() {
        return orderActualAmount;
    }

    public void setOrderActualAmount(BigDecimal orderActualAmount) {
        this.orderActualAmount = orderActualAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getPreferenceAmount() {
        return preferenceAmount;
    }

    public void setPreferenceAmount(BigDecimal preferenceAmount) {
        this.preferenceAmount = preferenceAmount;
    }

    public String getAsynReturnUrl() {
        return asynReturnUrl;
    }

    public void setAsynReturnUrl(String asynReturnUrl) {
        this.asynReturnUrl = asynReturnUrl == null ? null : asynReturnUrl.trim();
    }

    public String getSynReturnUrl() {
        return synReturnUrl;
    }

    public void setSynReturnUrl(String synReturnUrl) {
        this.synReturnUrl = synReturnUrl == null ? null : synReturnUrl.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle == null ? null : orderTitle.trim();
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderIp() {
        return orderIp;
    }

    public void setOrderIp(String orderIp) {
        this.orderIp = orderIp == null ? null : orderIp.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public String getMergeOrderNo() {
        return mergeOrderNo;
    }

    public void setMergeOrderNo(String mergeOrderNo) {
        this.mergeOrderNo = mergeOrderNo == null ? null : mergeOrderNo.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}