package com.ihavecar.payment.entity;

public class PayOrderMergeKey {
    private String mergeOrderNo;

    private String payOrderNo;

    public String getMergeOrderNo() {
        return mergeOrderNo;
    }

    public void setMergeOrderNo(String mergeOrderNo) {
        this.mergeOrderNo = mergeOrderNo == null ? null : mergeOrderNo.trim();
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo == null ? null : payOrderNo.trim();
    }
}