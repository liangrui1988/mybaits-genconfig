package com.ihavecar.payment.entity;

import java.util.Date;

public class PayRefundProcess {
    private String refundPayNo;

    private Long id;

    private Integer currStatus;

    private Integer preStatus;

    private Integer createBy;

    private Date createTime;

    private String delFlag;

    private String remarks;

    public String getRefundPayNo() {
        return refundPayNo;
    }

    public void setRefundPayNo(String refundPayNo) {
        this.refundPayNo = refundPayNo == null ? null : refundPayNo.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(Integer currStatus) {
        this.currStatus = currStatus;
    }

    public Integer getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(Integer preStatus) {
        this.preStatus = preStatus;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}